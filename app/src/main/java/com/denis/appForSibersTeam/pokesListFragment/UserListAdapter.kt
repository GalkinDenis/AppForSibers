package com.denis.appForSibersTeam.pokesListFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.denis.appForSibersTeam.data.Pokes
import com.denis.appForSibersTeam.viewModels.PokeViewModel
import com.example.inventory.R
import com.example.inventory.databinding.UserListItemBinding
import com.squareup.picasso.Picasso

class UserListAdapter(private val viewModel: PokeViewModel) :
    RecyclerView.Adapter<UserListAdapter.ItemViewHolder>() {

    var items = mutableListOf<Pokes>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount() = items.size

    class ItemViewHolder(var binding: UserListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onViewAttachedToWindow(holder: ItemViewHolder) {
        super.onViewAttachedToWindow(holder)
        //Add new item to list of pokes, when reached end of list.
        if(items.size > 20) {
            if (holder.layoutPosition + 1 == items.size) {
                viewModel.fillingOfList()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            UserListItemBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        with(holder.binding) {
                Picasso.get()
                    .load(items[position].avatar)
                    .error(R.drawable.ic_baseline_cloud_off_24)
                    .placeholder(R.drawable.progress_animation)
                    .centerCrop()
                    .fit()
                    .noFade()
                    .into(avatarPoke)

            pokeNameDescribe.text = items[position].name
            pokeAbilityDescribe.text = items[position].ability
        }

        //Sending selected poke data.
        with(holder.itemView){
            setOnClickListener {
                viewModel.flag = true
                val action = PokesListFragmentDirections.actionPokesListFragmentToDescriberPokeFragment(
                    avatar = items[position].avatar,
                    name = items[position].name,
                    ability = items[position].ability,
                    weight = items[position].weight,
                    height = items[position].height,
                    types = items[position].types,
                    hp = items[position].hp,
                    attack = items[position].attack,
                    defence = items[position].defence,
                    speed = items[position].speed,
                    )
                findNavController().navigate(action)
            }
        }


    }

}
