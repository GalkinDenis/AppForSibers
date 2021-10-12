package com.denis.appForSibersTeam.app.components

import com.denis.appForSibersTeam.pokesListFragment.PokesListFragment
import dagger.Subcomponent

@Subcomponent
interface AddPokesFragmentViewModelComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): AddPokesFragmentViewModelComponent
    }

    fun injectPokesListFragment(fragment: PokesListFragment)
}