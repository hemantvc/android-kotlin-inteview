package com.hariom.androidinterviewcode.api

import com.hariom.androidinterviewcode.model.QuoteList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

// https://quotable.io/quotes?page=1

interface QuoteService {
    @GET("/quotes")
    suspend fun getQuotes(@Query("page") page: Int) : Response<QuoteList>
}