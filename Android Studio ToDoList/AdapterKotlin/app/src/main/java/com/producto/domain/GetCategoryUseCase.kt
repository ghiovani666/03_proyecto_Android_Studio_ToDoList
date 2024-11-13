package com.producto.domain

import com.producto.data.repository.CategoryRepository
import com.producto.data.repository.ProductRepository

class GetCategoryUseCase {
    private val repository = CategoryRepository();
    suspend operator fun invoke() = repository.getAllCategoryRepository()
//7
}