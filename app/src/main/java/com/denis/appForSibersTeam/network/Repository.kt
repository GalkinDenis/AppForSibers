package com.denis.appForSibersTeam.network

import androidx.lifecycle.LiveData
import com.denis.appForSibersTeam.data.ItemDao
import com.denis.appForSibersTeam.data.Pokes
import com.denis.appForSibersTeam.forJsonParse.PokeDeserialization
import com.denis.appForSibersTeam.viewModels.Model
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(
    private val model: Model,
    private val remoteDataSource: RemoteDataSource
    ) {

    //Request JSON.
    suspend fun getJsonResponse(position: Int): Response<PokeDeserialization> {
            return remoteDataSource.getJsonResponse(position)
    }

    //Updating list of pokes.
    fun getAllItems(dao: ItemDao): LiveData<List<Pokes>> {
        return model.getAllItems(dao)
    }

    //Filling DB.
    suspend fun insertToDatabase(dao: ItemDao, items: Pokes) {
        model.insertToDatabase(dao, items)
    }

    suspend fun clearTable(dao: ItemDao) {
        model.clearTable(dao)
    }

}