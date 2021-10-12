package com.denis.appForSibersTeam.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {

    @Insert
    suspend fun insert(item: Pokes)

    @Query("SELECT * from Pokes")
    fun getListOfPokes(): Flow<List<Pokes>>

    @Query("DELETE FROM Pokes")
    suspend fun clearTable()

}
