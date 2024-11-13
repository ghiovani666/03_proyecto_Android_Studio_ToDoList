package com.producto.data.repository

import com.producto.data.model.ProductModel
import com.producto.data.model.ProductProvider
import com.producto.data.network.ProductService

class ProductRepository {

    private val api = ProductService()

    suspend fun getAllProductRepository(): List<ProductModel> {
        val response = api.getProductServices()
        ProductProvider.productos = response
        return response
    }
}
//5

//Llamamos al 4 y 6 creado recien de este punto