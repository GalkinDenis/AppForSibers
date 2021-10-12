package com.denis.appForSibersTeam.app.modules

import androidx.lifecycle.ViewModel
import com.denis.appForSibersTeam.app.keys.ViewModelKey
import com.denis.appForSibersTeam.viewModels.DescribeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
abstract class DescribeViewModelModule {
    @Binds
    @IntoMap
    @Singleton
    @ViewModelKey(DescribeViewModel::class)
    abstract fun provideDescribeViewModel(viewModel: DescribeViewModel): ViewModel
}