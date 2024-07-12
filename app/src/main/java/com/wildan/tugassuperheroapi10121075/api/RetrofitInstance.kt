package com.wildan.tugassuperheroapi10121075.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "https://www.superheroapi.com/api/85b28f9f8e65a25969e78822b1858c36/"

    val api: SuperheroApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SuperheroApi::class.java)
    }
}