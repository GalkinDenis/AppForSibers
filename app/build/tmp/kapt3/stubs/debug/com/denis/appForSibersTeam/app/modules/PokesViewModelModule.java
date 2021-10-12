package com.denis.appForSibersTeam.app.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/denis/appForSibersTeam/app/modules/PokesViewModelModule;", "", "()V", "providePokesViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/denis/appForSibersTeam/viewModels/PokeViewModel;", "app_debug"})
@dagger.Module()
public abstract class PokesViewModelModule {
    
    public PokesViewModelModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.denis.appForSibersTeam.app.keys.ViewModelKey(value = com.denis.appForSibersTeam.viewModels.PokeViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel providePokesViewModel(@org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.viewModels.PokeViewModel viewModel);
}