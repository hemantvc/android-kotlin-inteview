package com.hariom.androidinterviewcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count : Int = 1
    lateinit var textCount : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textCount = findViewById<TextView>(R.id.tvCounterValue)
        textCount.text = "$count"
        Log.i("Thread", "thread runs on ${Thread.currentThread().name}")
    }


    fun updateCounter(view: View) {

        Log.i("Thread", "thread runs on ${Thread.currentThread().name}")
        executeLogRunningTask()
        textCount.text = "${++count}"
    }

    private fun executeLogRunningTask(){
        for ( i in 1..100 ){
            count = i
        }
    }

}