package com.denis.appForSibersTeam.app.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/denis/appForSibersTeam/app/components/AppComponent;", "", "createUserCardViewModelComponent", "Lcom/denis/appForSibersTeam/app/components/AddDescribeViewModelComponent$Factory;", "createUserFragmentViewModelComponent", "Lcom/denis/appForSibersTeam/app/components/AddPokesFragmentViewModelComponent$Factory;", "Factory", "app_release"})
@dagger.Component(modules = {com.denis.appForSibersTeam.app.modules.DataModule.class, com.denis.appForSibersTeam.app.modules.RepositoryModule.class, com.denis.appForSibersTeam.app.modules.DescribeViewModelModule.class, com.denis.appForSibersTeam.app.modules.PokesViewModelModule.class, com.denis.appForSibersTeam.app.modules.ViewModelFactoryModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.denis.appForSibersTeam.app.components.AddPokesFragmentViewModelComponent.Factory createUserFragmentViewModelComponent();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.denis.appForSibersTeam.app.components.AddDescribeViewModelComponent.Factory createUserCardViewModelComponent();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/denis/appForSibersTeam/app/components/AppComponent$Factory;", "", "create", "Lcom/denis/appForSibersTeam/app/components/AppComponent;", "applicationContext", "Landroid/content/Context;", "app_release"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.denis.appForSibersTeam.app.components.AppComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.content.Context applicationContext);
    }
}