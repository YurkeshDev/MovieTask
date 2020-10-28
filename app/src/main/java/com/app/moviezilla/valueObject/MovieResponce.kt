package com.app.moviezilla.valueObject


import com.google.gson.annotations.SerializedName

data class MovieResponce(
        val page: Int,
        @SerializedName("results")
        val results: List<Movie>,
        @SerializedName("total_pages")
        val totalPages: Int,
        @SerializedName("total_results")
        val totalResults: Int
)