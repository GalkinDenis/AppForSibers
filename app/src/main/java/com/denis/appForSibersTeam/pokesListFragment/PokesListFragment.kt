package com.denis.appForSibersTeam.pokesListFragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.denis.appForSibersTeam.app.App
import com.denis.appForSibersTeam.data.Pokes
import com.denis.appForSibersTeam.viewModels.PokeApiStatus
import com.denis.appForSibersTeam.viewModels.PokeViewModel
import com.example.inventory.R
import com.example.inventory.databinding.UserListFragmentBinding
import javax.inject.Inject

class PokesListFragment : Fragment() {

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel by viewModels<PokeViewModel> { viewModelFactory }

    private var _binding: UserListFragmentBinding? = null
    private val binding get() = _binding!!

    private var adapter: UserListAdapter? = null

    //Привязка модели.
    override fun onAttach(context: Context) {
        super.onAttach(context)
        (requireActivity().application as App).appComponent.createUserFragmentViewModelComponent()
            .create().injectPokesListFragment(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = UserListFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            checkHp.isChecked = viewModel.hp
            checkAttack.isChecked = viewModel.attack
            checkDefence.isChecked = viewModel.defence

            adapter = UserListAdapter(viewModel)
            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.adapter = adapter
            recyclerView.setItemViewCacheSize(30)
        }

        //Updating of poke list from DB.
        viewModel.getAllPoke(
            this,
            binding.checkHp,
            binding.checkAttack,
            binding.checkDefence
        ).observe(this.viewLifecycleOwner) { items ->
            when {
                //Filling of list by data from DB if she is not empty.
                items.isNotEmpty() -> {
                    binding.note.visibility = View.INVISIBLE
                }

                //Loaded list from net, if DB is not empty.
                items.isEmpty() -> {
                    viewModel.fillingOfList()
                }
            }

            //Updating list.
            items.let {
                adapter?.items = it as MutableList<Pokes>
                binding.progressBar.visibility = View.GONE
            }
        }

        binding.checkHp.setOnCheckedChangeListener { _, isChecked ->
            viewModel.hp = isChecked
            viewModel.sortedAllPoke()
            if(isChecked) binding.recyclerView.layoutManager?.scrollToPosition(0)
        }

        binding.checkAttack.setOnCheckedChangeListener { _, isChecked ->
            viewModel.attack = isChecked
            viewModel.sortedAllPoke()
            if(isChecked) binding.recyclerView.layoutManager?.scrollToPosition(0)
        }

        binding.checkDefence.setOnCheckedChangeListener { _, isChecked ->
            viewModel.defence = isChecked
            viewModel.sortedAllPoke()
            if(isChecked) binding.recyclerView.layoutManager?.scrollToPosition(0)
        }

        //Function of reinitialize list of pokes.
        binding.shuffleButton.setOnClickListener {
            binding.checkHp.isChecked = false
            binding.checkAttack.isChecked = false
            binding.checkDefence.isChecked = false
            viewModel.shufflePokeList()
        }


        //Output toast if async request is failed.
        viewModel.networkResponse.observe(this.viewLifecycleOwner) { networkResponse ->
            when(networkResponse) {
                PokeApiStatus.ERROR -> {
                    binding.note.visibility = View.VISIBLE
                    Toast.makeText(
                        context,
                        getString(R.string.network_error),
                        Toast.LENGTH_LONG
                    ).show()
                }
                else -> return@observe
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}
