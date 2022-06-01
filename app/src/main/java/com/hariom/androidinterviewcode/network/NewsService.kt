package com.hariom.androidinterviewcode.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Singleton class for api call
 */
object NewsService {
    val newsInstance : INewsApi
    init {
        val retrofit = Retrofit.Builder()
                         .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        newsInstance = retrofit.create(INewsApi::class.java)
    }
}

