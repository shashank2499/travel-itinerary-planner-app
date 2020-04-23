package com.example.navigation

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URL1="http://192.168.1.10/Myapi/"

interface buddhismapi {
    @GET("buddhism.php")
    fun getplaces(): Call<List<place>>
    companion object{
        operator fun invoke():buddhismapi{
            return Retrofit.Builder().baseUrl(BASE_URL1).addConverterFactory(GsonConverterFactory.create()).build().create(buddhismapi::class.java)
        }
    }
}