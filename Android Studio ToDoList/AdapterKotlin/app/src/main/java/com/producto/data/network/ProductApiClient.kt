package com.producto.data.network

import com.producto.data.model.ProductModel
import retrofit2.Response
import retrofit2.http.GET

interface ProductApiClient {
    @GET("products")
    suspend fun getAllProductApiClient(): Response<List<ProductModel>>
}
//3