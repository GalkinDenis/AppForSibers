package com.denis.appForSibersTeam.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020+H\u0002J\u0006\u0010,\u001a\u00020-J2\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u000202J\u0006\u00105\u001a\u00020-J\u0006\u00106\u001a\u00020-J\b\u00107\u001a\u00020-H\u0002J\b\u00108\u001a\u00020-H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/denis/appForSibersTeam/viewModels/PokeViewModel;", "Landroidx/lifecycle/ViewModel;", "dao", "Lcom/denis/appForSibersTeam/data/ItemDao;", "repository", "Lcom/denis/appForSibersTeam/network/Repository;", "(Lcom/denis/appForSibersTeam/data/ItemDao;Lcom/denis/appForSibersTeam/network/Repository;)V", "_networkResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/denis/appForSibersTeam/viewModels/PokeApiStatus;", "allPokeFromDB", "Landroidx/lifecycle/LiveData;", "", "Lcom/denis/appForSibersTeam/data/Pokes;", "allPokeToPokeList", "attack", "", "getAttack", "()Z", "setAttack", "(Z)V", "defence", "getDefence", "setDefence", "flag", "getFlag", "setFlag", "hp", "getHp", "setHp", "listOfPokes", "", "", "networkResponse", "getNetworkResponse", "()Landroidx/lifecycle/MutableLiveData;", "position", "", "savedList", "sumOfIndicators", "", "createTableItem", "poke", "Lcom/denis/appForSibersTeam/forJsonParse/PokeDeserialization;", "fillingOfList", "", "getAllPoke", "userListFragment", "Lcom/denis/appForSibersTeam/pokesListFragment/PokesListFragment;", "switchHp", "Landroid/widget/CheckBox;", "switchAttack", "switchDefence", "shufflePokeList", "sortedAllPoke", "sortedIfSelectMoreThanOne", "sortedIfSelectOneOfAll", "app_debug"})
public final class PokeViewModel extends androidx.lifecycle.ViewModel {
    @kotlin.jvm.Volatile()
    private volatile com.denis.appForSibersTeam.data.ItemDao dao;
    private final com.denis.appForSibersTeam.network.Repository repository = null;
    private boolean flag = false;
    private int position = 1;
    private long sumOfIndicators = 0L;
    private boolean hp = false;
    private boolean attack = false;
    private boolean defence = false;
    private final java.util.List<java.lang.String> listOfPokes = null;
    private java.util.List<com.denis.appForSibersTeam.data.Pokes> savedList;
    private final androidx.lifecycle.LiveData<java.util.List<com.denis.appForSibersTeam.data.Pokes>> allPokeFromDB = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.denis.appForSibersTeam.data.Pokes>> allPokeToPokeList;
    private androidx.lifecycle.MutableLiveData<com.denis.appForSibersTeam.viewModels.PokeApiStatus> _networkResponse;
    
    @javax.inject.Inject()
    public PokeViewModel(@org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.data.ItemDao dao, @org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.network.Repository repository) {
        super();
    }
    
    public final boolean getFlag() {
        return false;
    }
    
    public final void setFlag(boolean p0) {
    }
    
    public final boolean getHp() {
        return false;
    }
    
    public final void setHp(boolean p0) {
    }
    
    public final boolean getAttack() {
        return false;
    }
    
    public final void setAttack(boolean p0) {
    }
    
    public final boolean getDefence() {
        return false;
    }
    
    public final void setDefence(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.denis.appForSibersTeam.viewModels.PokeApiStatus> getNetworkResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.denis.appForSibersTeam.data.Pokes>> getAllPoke(@org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.pokesListFragment.PokesListFragment userListFragment, @org.jetbrains.annotations.NotNull()
    android.widget.CheckBox switchHp, @org.jetbrains.annotations.NotNull()
    android.widget.CheckBox switchAttack, @org.jetbrains.annotations.NotNull()
    android.widget.CheckBox switchDefence) {
        return null;
    }
    
    public final void sortedAllPoke() {
    }
    
    private final void sortedIfSelectOneOfAll() {
    }
    
    private final void sortedIfSelectMoreThanOne() {
    }
    
    public final void shufflePokeList() {
    }
    
    public final void fillingOfList() {
    }
    
    private final com.denis.appForSibersTeam.data.Pokes createTableItem(com.denis.appForSibersTeam.forJsonParse.PokeDeserialization poke) {
        return null;
    }
}