package com.denis.appForSibersTeam.app.modules

import android.content.Context
import androidx.room.Room
import com.denis.appForSibersTeam.data.ItemDao
import com.denis.appForSibersTeam.data.ItemRoomDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object DataModule {

    @Singleton
    @Provides
    fun provideDao(dataBase: ItemRoomDatabase): ItemDao {
        return dataBase.itemDao()
    }

    @Singleton
    @Provides
    fun provideDataBase(context: Context): ItemRoomDatabase {
        return synchronized(this) {
            Room.databaseBuilder(
                context.applicationContext,
                ItemRoomDatabase::class.java,
                "AppForRentaTeam.db"
            ).build()
        }
    }
}