package com.denis.appForSibersTeam.app.modules

import androidx.lifecycle.ViewModelProvider
import com.denis.appForSibersTeam.viewModels.ViewModelFactory
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class ViewModelFactoryModule {

    @Binds
    @Singleton
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}

