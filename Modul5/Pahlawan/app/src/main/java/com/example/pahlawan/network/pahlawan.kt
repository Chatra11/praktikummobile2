package com.example.pahlawan.network

import com.squareup.moshi.Json

data class Pahlawan(
    val name: String,
    @Json(name = "birth_year")
    val birth_year:String,
    val description:String,
    @Json(name = "death_year")
    val death_year:String,
    val ascension_year: Int
)