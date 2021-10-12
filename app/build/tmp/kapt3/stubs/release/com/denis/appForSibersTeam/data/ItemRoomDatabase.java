package com.denis.appForSibersTeam.data;

import java.lang.System;

@androidx.room.Database(entities = {com.denis.appForSibersTeam.data.Pokes.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/denis/appForSibersTeam/data/ItemRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "itemDao", "Lcom/denis/appForSibersTeam/data/ItemDao;", "app_release"})
public abstract class ItemRoomDatabase extends androidx.room.RoomDatabase {
    
    public ItemRoomDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.denis.appForSibersTeam.data.ItemDao itemDao();
}