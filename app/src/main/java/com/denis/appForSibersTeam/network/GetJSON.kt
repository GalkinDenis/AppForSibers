package com.denis.appForSibersTeam.network

import com.denis.appForSibersTeam.forJsonParse.PokeDeserialization
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface GetJSON {
    @GET("{path}")
    suspend fun getPokes(@Path("path") count: Int): Response<PokeDeserialization>
}