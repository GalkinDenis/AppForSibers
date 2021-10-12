package com.denis.appForSibersTeam.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://pokeapi.co/api/v2/pokemon/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

object PokeApi {
    val retrofitService : GetJSON by lazy { retrofit.create(GetJSON::class.java) }
}

