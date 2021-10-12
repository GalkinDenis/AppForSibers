package com.denis.appForSibersTeam.app.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/denis/appForSibersTeam/app/modules/DescribeViewModelModule;", "", "()V", "provideDescribeViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/denis/appForSibersTeam/viewModels/DescribeViewModel;", "app_release"})
@dagger.Module()
public abstract class DescribeViewModelModule {
    
    public DescribeViewModelModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.denis.appForSibersTeam.app.keys.ViewModelKey(value = com.denis.appForSibersTeam.viewModels.DescribeViewModel.class)
    @javax.inject.Singleton()
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel provideDescribeViewModel(@org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.viewModels.DescribeViewModel viewModel);
}