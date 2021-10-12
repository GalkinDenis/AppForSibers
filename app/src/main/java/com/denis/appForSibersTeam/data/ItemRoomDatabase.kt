package com.denis.appForSibersTeam.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Pokes::class], version = 1, exportSchema = false)
abstract class ItemRoomDatabase : RoomDatabase() {

    abstract fun itemDao(): ItemDao

}
