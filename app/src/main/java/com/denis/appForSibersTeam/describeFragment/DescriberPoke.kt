package com.denis.appForSibersTeam.describeFragment

import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.denis.appForSibersTeam.app.App
import com.denis.appForSibersTeam.viewModels.DescribeViewModel
import com.example.inventory.R
import com.example.inventory.databinding.DescribePokeLayoutBinding
import com.squareup.picasso.Picasso
import javax.inject.Inject

class DescriberPoke : Fragment() {

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel by viewModels<DescribeViewModel> { viewModelFactory }

    private var _binding: DescribePokeLayoutBinding? = null
    private val binding get() = _binding!!

    private fun attachAvatar() {
        Picasso.get()
            .load(viewModel.avatar)
            .error(R.drawable.ic_baseline_cloud_off_24)
            .placeholder(R.drawable.progress_animation)
            .centerCrop()
            .fit()
            .noFade()
            .into(binding.avatarHead)
    }

    private fun bindViews() {
        with(binding) {
            hpHead.text = getString(R.string.hp_head)
            hp.text = viewModel.hp.toString()

            weightHead.text = getString(R.string.weight_head)
            weight.text = viewModel.weight.toString()

            heightHead.text = getString(R.string.height_head)
            height.text = viewModel.height.toString()

            speedHead.text = getString(R.string.speed_head)
            speed.text = viewModel.speed.toString()

            attackHead.text = getString(R.string.attack_head)
            attack.text = viewModel.attack.toString()

            defenceHead.text = getString(R.string.defence_head)
            defence.text = viewModel.defence.toString()

            typesHead.text = getString(R.string.types_head)
            types.text = viewModel.types

            abilityHead.text = getString(R.string.ability_head)
            ability.text = viewModel.ability
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (requireActivity().application as App).appComponent.createUserCardViewModelComponent()
            .create().injectDescribeFragment(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DescribePokeLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        //Get sended data from poke item.
        arguments?.let { data ->
            with(data) {
                if(!isEmpty) {
                        //Title fragment.
                                (activity as AppCompatActivity?)!!
                                    .supportActionBar!!
                                    .title = getString("name").toString()

                    //Saving state of views in viewModel.
                    viewModel.attachUser(
                        getString("avatar").toString(),
                        getString("ability").toString(),
                        getLong("weight"),
                        getLong("height"),
                        getString("types").toString(),
                        getLong("hp"),
                        getLong("attack"),
                        getLong("defence"),
                        getLong("speed")
                    )
                }

                //Set avatar.
                attachAvatar()

                //Binding textViews.
                bindViews()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
             _binding = null
    }
}