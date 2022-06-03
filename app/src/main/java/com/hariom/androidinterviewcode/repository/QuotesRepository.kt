 package com.hariom.androidinterviewcode.repository

 import androidx.lifecycle.LiveData
 import androidx.lifecycle.MutableLiveData
 import com.hariom.androidinterviewcode.api.QuoteService
 import com.hariom.androidinterviewcode.db.QuoteDatabase
 import com.hariom.androidinterviewcode.model.QuoteList

 class QuotesRepository(private val quoteService: QuoteService,private val quoteDatabase: QuoteDatabase) {

     private val quotesLiveData = MutableLiveData<QuoteList>()

     val quotes : LiveData<QuoteList>
     get() = quotesLiveData


     suspend fun getQuotes(page : Int){
         val result = quoteService.getQuotes(page)
         if(result?.body() != null){
             quoteDatabase.quoteDao().addQuotes(result.body()!!.results)
             quotesLiveData.postValue(result.body())
         }
     }

}