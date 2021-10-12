package com.denis.appForSibersTeam.pokesListFragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/denis/appForSibersTeam/pokesListFragment/UserListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/denis/appForSibersTeam/pokesListFragment/UserListAdapter$ItemViewHolder;", "viewModel", "Lcom/denis/appForSibersTeam/viewModels/PokeViewModel;", "(Lcom/denis/appForSibersTeam/viewModels/PokeViewModel;)V", "value", "", "Lcom/denis/appForSibersTeam/data/Pokes;", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "ItemViewHolder", "app_release"})
public final class UserListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.denis.appForSibersTeam.pokesListFragment.UserListAdapter.ItemViewHolder> {
    private final com.denis.appForSibersTeam.viewModels.PokeViewModel viewModel = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.denis.appForSibersTeam.data.Pokes> items;
    
    public UserListAdapter(@org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.viewModels.PokeViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denis.appForSibersTeam.data.Pokes> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.denis.appForSibersTeam.data.Pokes> value) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.pokesListFragment.UserListAdapter.ItemViewHolder holder) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.denis.appForSibersTeam.pokesListFragment.UserListAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.pokesListFragment.UserListAdapter.ItemViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lcom/denis/appForSibersTeam/pokesListFragment/UserListAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/inventory/databinding/UserListItemBinding;", "(Lcom/example/inventory/databinding/UserListItemBinding;)V", "getBinding", "()Lcom/example/inventory/databinding/UserListItemBinding;", "setBinding", "app_release"})
    public static final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.example.inventory.databinding.UserListItemBinding binding;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.inventory.databinding.UserListItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.inventory.databinding.UserListItemBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.example.inventory.databinding.UserListItemBinding p0) {
        }
    }
}