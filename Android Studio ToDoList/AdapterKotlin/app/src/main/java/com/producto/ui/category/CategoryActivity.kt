package com.producto.ui.category

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.producto.adapterkotlin.databinding.ActivityMainBinding
import com.producto.data.model.CategotyModel
import com.producto.data.model.ProductModel
import com.producto.ui.product.CategoryViewModel
import com.producto.ui.product.adapter.CategoryAdapter

class CategoryActivity : AppCompatActivity() {

    private var categoryEntityList: MutableList<CategotyModel> = mutableListOf()
    private var categoryAdapter: CategoryAdapter? = null
    private lateinit var binding: ActivityMainBinding
    private val categoryViewModel: CategoryViewModel by viewModels()

    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerViewId.layoutManager = LinearLayoutManager(this)
        categoryViewModel.onListCategory()

        categoryViewModel.categoryList.observe(this, Observer {

            categoryEntityList.clear()
            if (it != null) {
                categoryEntityList.addAll(it)
            }
            if (categoryAdapter == null) {
                categoryAdapter = CategoryAdapter(categoryEntityList)
                binding.recyclerViewId.adapter = categoryAdapter
            }
        })
    }

}
//9 y 10