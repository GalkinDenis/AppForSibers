package com.denis.appForSibersTeam.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0005\u001a\u00020\u0006J!\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/denis/appForSibersTeam/viewModels/Model;", "", "()V", "clearTable", "", "dao", "Lcom/denis/appForSibersTeam/data/ItemDao;", "(Lcom/denis/appForSibersTeam/data/ItemDao;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllItems", "Landroidx/lifecycle/LiveData;", "", "Lcom/denis/appForSibersTeam/data/Pokes;", "insertToDatabase", "poke", "(Lcom/denis/appForSibersTeam/data/ItemDao;Lcom/denis/appForSibersTeam/data/Pokes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class Model {
    @org.jetbrains.annotations.NotNull()
    public static final com.denis.appForSibersTeam.viewModels.Model INSTANCE = null;
    
    private Model() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.denis.appForSibersTeam.data.Pokes>> getAllItems(@org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.data.ItemDao dao) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertToDatabase(@org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.data.ItemDao dao, @org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.data.Pokes poke, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clearTable(@org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.data.ItemDao dao, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}