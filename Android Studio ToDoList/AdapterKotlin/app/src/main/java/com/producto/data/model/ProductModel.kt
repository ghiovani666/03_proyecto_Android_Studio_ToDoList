package com.producto.data.model

import com.google.gson.annotations.SerializedName

data class ProductModel(
    @SerializedName("name") val names: String,
    @SerializedName("material") val materials: String
)
//2