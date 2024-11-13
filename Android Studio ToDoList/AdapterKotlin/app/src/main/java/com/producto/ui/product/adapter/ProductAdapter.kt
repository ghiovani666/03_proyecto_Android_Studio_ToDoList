package com.producto.ui.product.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.producto.adapterkotlin.databinding.ProductItemBinding
import com.producto.data.model.ProductModel

/*
class ProductAdapter(private val productList: MutableList<ProductModel>) :
    RecyclerView.Adapter<CategoryAdapter.ProductsHolder>() {

    override fun onBindViewHolder(holder: ProductsHolder, position: Int) {
        val model = productList[position]
        holder.bind(model)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ProductItemBinding.inflate(layoutInflater, parent, false)
        return ProductsHolder(binding)
    }

    inner class ProductsHolder(private val binding: ProductItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ProductModel) {
            //binding.textName.text = item.names
            //binding.textMaterial.text = item.materials
        }
    }

    override fun getItemCount(): Int = productList.size
}
*/

//10