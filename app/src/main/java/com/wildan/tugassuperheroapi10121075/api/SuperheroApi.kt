package com.wildan.tugassuperheroapi10121075.api

import com.wildan.tugassuperheroapi10121075.model.Superhero
import retrofit2.Call
import retrofit2.http.GET

interface SuperheroApi {
    @GET("414")
    fun getSuperhero(): Call<Superhero>
}