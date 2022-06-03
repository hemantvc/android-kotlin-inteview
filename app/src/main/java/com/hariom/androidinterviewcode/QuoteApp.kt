package com.hariom.androidinterviewcode

import android.app.Application
import com.hariom.androidinterviewcode.api.QuoteService
import com.hariom.androidinterviewcode.api.RetrofitHelper
import com.hariom.androidinterviewcode.db.QuoteDatabase
import com.hariom.androidinterviewcode.repository.QuotesRepository

class QuoteApp : Application(){
lateinit var quotesRepository: QuotesRepository
    override fun onCreate() {
        super.onCreate()
        initialize()
    }

    private fun initialize() {
        val quoteService = RetrofitHelper.getInstant().create(QuoteService::class.java)
        val dataBase = QuoteDatabase.getDatabase(applicationContext)
        quotesRepository = QuotesRepository(quoteService, dataBase)
    }
}