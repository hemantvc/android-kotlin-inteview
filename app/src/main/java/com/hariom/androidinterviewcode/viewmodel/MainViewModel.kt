package com.hariom.androidinterviewcode.viewmodel


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hariom.androidinterviewcode.model.QuoteList
import com.hariom.androidinterviewcode.repository.QuotesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository: QuotesRepository) : ViewModel() {
    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getQuotes(1)
        }
    }

    fun getQuote(){
        viewModelScope.launch(Dispatchers.IO) {
            repository.getQuotes(1)
        }
    }


    val quotes: LiveData<QuoteList>
        get() = repository.quotes
}