package com.denis.appForSibersTeam.app.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/denis/appForSibersTeam/app/modules/RepositoryModule;", "", "()V", "provideModel", "Lcom/denis/appForSibersTeam/viewModels/Model;", "provideRemoteDataSource", "Lcom/denis/appForSibersTeam/network/RemoteDataSource;", "provideRepository", "Lcom/denis/appForSibersTeam/network/Repository;", "model", "remoteDataSource", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.denis.appForSibersTeam.app.modules.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.denis.appForSibersTeam.network.Repository provideRepository(@org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.viewModels.Model model, @org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.network.RemoteDataSource remoteDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.denis.appForSibersTeam.viewModels.Model provideModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.denis.appForSibersTeam.network.RemoteDataSource provideRemoteDataSource() {
        return null;
    }
}