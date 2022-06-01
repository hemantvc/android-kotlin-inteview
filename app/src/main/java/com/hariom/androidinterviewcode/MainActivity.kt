package com.hariom.androidinterviewcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "onCreate: ")

        val songList = listOf<String>("Dance","Bhakti","Dhoon","Classical")

        var songRecycleView = findViewById<RecyclerView>(R.id.rvSongList)
        songRecycleView.adapter = SongAdapter(songList)

        songRecycleView.layoutManager = LinearLayoutManager(this)


    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart: ")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause: ")
    }
    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy: ")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.i("MainActivity", "onSaveInstanceState: ")
    }


    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity", "onRestart: ")
    }

}