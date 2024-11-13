package com.producto.ui.product

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.producto.data.model.ProductModel
import com.producto.domain.GetProductsUseCase
import kotlinx.coroutines.launch

class ProductViewModel : ViewModel() {

    var getProductsUseCase = GetProductsUseCase()
    val productList : MutableLiveData<List<ProductModel>> = MutableLiveData()

    fun onListProduct() {
        viewModelScope.launch {
            val result = getProductsUseCase()
            if(!result.isNullOrEmpty()){
                productList.value = result
            }
        }
    }
}
//8