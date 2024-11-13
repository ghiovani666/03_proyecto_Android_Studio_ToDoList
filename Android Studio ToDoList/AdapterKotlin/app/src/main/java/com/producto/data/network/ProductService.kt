package com.producto.data.network

import com.producto.core.RetrofitHelper
import com.producto.data.model.ProductModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProductService {
    private val retrofit = RetrofitHelper.getRetrofit()
    suspend fun getProductServices(): List<ProductModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(ProductApiClient::class.java).getAllProductApiClient()
            response.body() ?: emptyList()
        }
    }
}
//4