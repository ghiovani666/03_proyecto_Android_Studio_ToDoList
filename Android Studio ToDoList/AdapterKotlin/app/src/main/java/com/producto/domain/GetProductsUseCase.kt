package com.producto.domain

import com.producto.data.repository.ProductRepository

class GetProductsUseCase {
    private val repository = ProductRepository()
    suspend operator fun invoke() = repository.getAllProductRepository()
//7
}