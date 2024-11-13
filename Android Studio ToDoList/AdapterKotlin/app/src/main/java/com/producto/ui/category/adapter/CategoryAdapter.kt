package com.producto.ui.product.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.producto.adapterkotlin.databinding.CategoryItemBinding
import com.producto.adapterkotlin.databinding.ProductItemBinding
import com.producto.data.model.CategotyModel

class CategoryAdapter(private val categoryList: MutableList<CategotyModel>) :
    RecyclerView.Adapter<CategoryAdapter.CategorysHolder>() {

    override fun onBindViewHolder(holder: CategorysHolder, position: Int) {
        val model = categoryList[position]
        holder.bind(model)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategorysHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = CategoryItemBinding.inflate(layoutInflater, parent, false)
        return CategorysHolder(binding)
    }

    inner class CategorysHolder(private val binding: CategoryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: CategotyModel) {
            binding.textId.text = item.ids
            binding.textTitle.text = item.titles
        }
    }

    override fun getItemCount(): Int = categoryList.size
}
//10