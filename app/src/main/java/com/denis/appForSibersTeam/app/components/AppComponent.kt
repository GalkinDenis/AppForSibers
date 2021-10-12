package com.denis.appForSibersTeam.app.components

import android.content.Context
import com.denis.appForSibersTeam.app.modules.*
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    DataModule::class,
    RepositoryModule::class,
    DescribeViewModelModule::class,
    PokesViewModelModule::class,
    ViewModelFactoryModule::class
])
interface AppComponent {
    fun createUserFragmentViewModelComponent(): AddPokesFragmentViewModelComponent.Factory
    fun createUserCardViewModelComponent(): AddDescribeViewModelComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }
}

