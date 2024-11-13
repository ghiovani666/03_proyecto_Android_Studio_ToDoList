package com.producto.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.fake-rest.refine.dev/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
//1