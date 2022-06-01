package com.hariom.androidinterviewcode.network

import com.hariom.androidinterviewcode.repository.News
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

// https://newsapi.org/v2/top-headlines?country=in&apiKey=7823c7e84e5c4ae2b07d868e3fb9ce73

interface INewsApi {

    @GET("v2/top-headlines?apiKey=$API_KEY")
    fun getHeadlines(@Query("country") country : String,@Query("page") page : Int) : Call<News>

}