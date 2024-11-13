package com.producto.ui.product

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.producto.adapterkotlin.databinding.ActivityMainBinding
import com.producto.data.model.ProductModel
import com.producto.ui.product.adapter.CategoryAdapter

class MainActivity : AppCompatActivity() {

    private var productEntityList: MutableList<ProductModel> = mutableListOf()
    private var productAdapter: CategoryAdapter? = null
    private lateinit var binding: ActivityMainBinding
    private val productViewModel: CategoryViewModel by viewModels()

    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
/*
        binding.recyclerViewId.layoutManager = LinearLayoutManager(this)
       // productViewModel.onListProduct()

      //  productViewModel.productList.observe(this, Observer {

            productEntityList.clear()
            if (it != null) {
                productEntityList.addAll(it)
            }
            if (productAdapter == null) {
                productAdapter = CategoryAdapter(productEntityList)
                binding.recyclerViewId.adapter = productAdapter
            }

        })

    */
    }

}
//9 y 10