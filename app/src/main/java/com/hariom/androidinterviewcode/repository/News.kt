package com.hariom.androidinterviewcode.repository

import com.hariom.androidinterviewcode.repository.Article

data class News(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)