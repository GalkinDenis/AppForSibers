package com.denis.appForSibersTeam.app.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/denis/appForSibersTeam/app/modules/DataModule;", "", "()V", "provideDao", "Lcom/denis/appForSibersTeam/data/ItemDao;", "dataBase", "Lcom/denis/appForSibersTeam/data/ItemRoomDatabase;", "provideDataBase", "context", "Landroid/content/Context;", "app_release"})
@dagger.Module()
public final class DataModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.denis.appForSibersTeam.app.modules.DataModule INSTANCE = null;
    
    private DataModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.denis.appForSibersTeam.data.ItemDao provideDao(@org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.data.ItemRoomDatabase dataBase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.denis.appForSibersTeam.data.ItemRoomDatabase provideDataBase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}