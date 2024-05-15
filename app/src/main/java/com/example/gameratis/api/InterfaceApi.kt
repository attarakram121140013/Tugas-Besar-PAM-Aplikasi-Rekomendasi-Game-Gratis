package com.example.gameratis.api

import retrofit2.http.GET
import retrofit2.http.Query


interface InterfaceApi {
    companion object{
        const val BASE_URL = "https://www.freetogame.com/"
    }

    @GET("api/")
    suspend fun getAllData(
        @Query("page") position: Int
    ): ResponseApi

}