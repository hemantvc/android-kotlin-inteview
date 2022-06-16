package com.hariom.androidinterviewcode

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hariom.androidinterviewcode.timer.TimerToast
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var mediaPlayer: MediaPlayer
    private lateinit var timer : TimerToast
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        mediaPlayer = MediaPlayer.create(this, R.raw.sample)
        timer = TimerToast(application)
        timer.start()
    }

    fun playSong(view: View) {
//        mediaPlayer.start()
    }
}