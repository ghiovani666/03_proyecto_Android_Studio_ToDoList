package com.producto.data.network

import com.producto.core.RetrofitHelper
import com.producto.data.model.CategotyModel
import com.producto.data.model.ProductModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CategoryService {
    private val retrofit = RetrofitHelper.getRetrofit()
    suspend fun getCategoryServices(): List<CategotyModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(CategoryApiClient::class.java).getAllCategoryApiClient()
            response.body() ?: emptyList()
        }
    }
}
//4