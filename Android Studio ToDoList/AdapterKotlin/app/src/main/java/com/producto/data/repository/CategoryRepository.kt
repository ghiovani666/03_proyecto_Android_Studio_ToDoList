package com.producto.data.repository

import com.producto.data.model.CategoryProvider
import com.producto.data.model.CategotyModel
import com.producto.data.model.ProductModel
import com.producto.data.model.ProductProvider
import com.producto.data.network.CategoryService
import com.producto.data.network.ProductService

class CategoryRepository {

    private val api = CategoryService()

    suspend fun getAllCategoryRepository(): List<CategotyModel> {
        val response = api.getCategoryServices()
        CategoryProvider.categorys = response
        return response
    }
}
//5

//Llamamos al 4 y 6 creado recien de este punto