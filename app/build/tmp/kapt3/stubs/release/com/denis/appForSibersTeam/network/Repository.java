package com.denis.appForSibersTeam.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\t\u001a\u00020\nJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J!\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/denis/appForSibersTeam/network/Repository;", "", "model", "Lcom/denis/appForSibersTeam/viewModels/Model;", "remoteDataSource", "Lcom/denis/appForSibersTeam/network/RemoteDataSource;", "(Lcom/denis/appForSibersTeam/viewModels/Model;Lcom/denis/appForSibersTeam/network/RemoteDataSource;)V", "clearTable", "", "dao", "Lcom/denis/appForSibersTeam/data/ItemDao;", "(Lcom/denis/appForSibersTeam/data/ItemDao;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllItems", "Landroidx/lifecycle/LiveData;", "", "Lcom/denis/appForSibersTeam/data/Pokes;", "getJsonResponse", "Lretrofit2/Response;", "Lcom/denis/appForSibersTeam/forJsonParse/PokeDeserialization;", "position", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertToDatabase", "items", "(Lcom/denis/appForSibersTeam/data/ItemDao;Lcom/denis/appForSibersTeam/data/Pokes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class Repository {
    private final com.denis.appForSibersTeam.viewModels.Model model = null;
    private final com.denis.appForSibersTeam.network.RemoteDataSource remoteDataSource = null;
    
    @javax.inject.Inject()
    public Repository(@org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.viewModels.Model model, @org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.network.RemoteDataSource remoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getJsonResponse(int position, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.denis.appForSibersTeam.forJsonParse.PokeDeserialization>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.denis.appForSibersTeam.data.Pokes>> getAllItems(@org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.data.ItemDao dao) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertToDatabase(@org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.data.ItemDao dao, @org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.data.Pokes items, @org.jetbrains.annotations.NotNull()
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