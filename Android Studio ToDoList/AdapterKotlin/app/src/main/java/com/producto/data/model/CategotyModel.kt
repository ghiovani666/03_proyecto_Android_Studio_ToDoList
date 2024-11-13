package com.producto.data.model

import com.google.gson.annotations.SerializedName

data class CategotyModel(
    @SerializedName("id") val ids: String,
    @SerializedName("title") val titles: String
)
//2