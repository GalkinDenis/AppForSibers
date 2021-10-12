package com.denis.appForSibersTeam.viewModels

import androidx.lifecycle.asLiveData
import com.denis.appForSibersTeam.data.ItemDao
import com.denis.appForSibersTeam.data.Pokes

object Model {

    //Updating items of poke list.
    fun getAllItems(dao: ItemDao) = dao.getListOfPokes().asLiveData()

    //Filling table DB by data from deserialized JSON.
    suspend fun insertToDatabase(dao: ItemDao, poke: Pokes) {
        dao.insert(poke)
    }

    suspend fun clearTable(dao: ItemDao) {
        dao.clearTable()
    }

}