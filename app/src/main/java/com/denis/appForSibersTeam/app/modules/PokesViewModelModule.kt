package com.denis.appForSibersTeam.app.modules

import androidx.lifecycle.ViewModel
import com.denis.appForSibersTeam.app.keys.ViewModelKey
import com.denis.appForSibersTeam.viewModels.PokeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
abstract class PokesViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(PokeViewModel::class)
    abstract fun providePokesViewModel(viewModel: PokeViewModel): ViewModel
}