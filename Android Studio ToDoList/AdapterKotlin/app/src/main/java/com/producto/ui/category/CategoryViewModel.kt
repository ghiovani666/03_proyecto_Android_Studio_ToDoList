package com.producto.ui.product

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.producto.data.model.CategotyModel
import com.producto.data.model.ProductModel
import com.producto.domain.GetCategoryUseCase
import com.producto.domain.GetProductsUseCase
import kotlinx.coroutines.launch

class CategoryViewModel : ViewModel() {

    var getCategoryUseCase = GetCategoryUseCase()
    val categoryList : MutableLiveData<List<CategotyModel>> = MutableLiveData()

    fun onListCategory() {
        viewModelScope.launch {
            val result = getCategoryUseCase()
            if(!result.isNullOrEmpty()){
                categoryList.value = result
            }
        }
    }
}
//8