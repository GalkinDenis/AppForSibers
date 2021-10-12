package com.denis.appForSibersTeam.app.components

import com.denis.appForSibersTeam.describeFragment.DescriberPoke
import dagger.Subcomponent

@Subcomponent
interface AddDescribeViewModelComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): AddDescribeViewModelComponent
    }

    fun injectDescribeFragment(fragment: DescriberPoke)
}