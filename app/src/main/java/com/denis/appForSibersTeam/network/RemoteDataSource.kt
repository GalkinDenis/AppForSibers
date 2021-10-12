package com.denis.appForSibersTeam.network

import com.denis.appForSibersTeam.forJsonParse.PokeDeserialization
import retrofit2.Response

object RemoteDataSource {

    //Request JSON.
    suspend fun getJsonResponse(position: Int): Response<PokeDeserialization> {
        return PokeApi.retrofitService.getPokes(position)
    }

}