package com.producto.data.network

import com.producto.data.model.CategotyModel
import com.producto.data.model.ProductModel
import retrofit2.Response
import retrofit2.http.GET

interface CategoryApiClient {
    @GET("categories")
    suspend fun getAllCategoryApiClient(): Response<List<CategotyModel>>
}
//3