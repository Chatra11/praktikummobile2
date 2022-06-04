package com.example.pahlawan.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://indonesia-public-static-api.vercel.app/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()
interface PahlawanServiceApi{
    @GET("api/heroes")
    suspend fun getData() : List<Pahlawan>
}
object PahlawanApi{
    val retrofitServiceApi: PahlawanServiceApi by lazy {
        retrofit.create(PahlawanServiceApi::class.java)
    }
}