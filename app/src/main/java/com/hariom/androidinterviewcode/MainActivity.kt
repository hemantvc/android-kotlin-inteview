package com.hariom.androidinterviewcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.hariom.androidinterviewcode.repository.QuotesRepository
import com.hariom.androidinterviewcode.api.QuoteService
import com.hariom.androidinterviewcode.api.RetrofitHelper
import com.hariom.androidinterviewcode.viewmodel.MainViewFactory
import com.hariom.androidinterviewcode.viewmodel.MainViewModel

/***
 * https://www.youtube.com/watch?v=PU0ua391_u0
 */
class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quoteService = RetrofitHelper.getInstant().create(QuoteService::class.java)
        val repository = QuotesRepository(quoteService)
        mainViewModel = ViewModelProvider(this, MainViewFactory(repository)).get(MainViewModel::class.java)

        mainViewModel.quotes.observe(this, Observer {
            Log.d("Quote", "Quote data: "+it.results.toString())
        })

    }

    fun getQuotes(view: View) {
        Log.d("Quote", "getQuotes click ")
        mainViewModel.getQuote()
    }
}