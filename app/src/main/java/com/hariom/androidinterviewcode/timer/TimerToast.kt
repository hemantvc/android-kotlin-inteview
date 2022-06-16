package com.hariom.androidinterviewcode.timer

import android.app.Application
import android.os.CountDownTimer
import android.widget.Toast

class TimerToast(application: Application) {
    private val timer: CountDownTimer = object : CountDownTimer(60000, 3000){


        override fun onFinish() {
            Toast.makeText(application, "Finish countdown timer!", Toast.LENGTH_SHORT).show()
        }

        override fun onTick(p0: Long) {
            Toast.makeText(application, "$p0", Toast.LENGTH_SHORT).show()
        }

    }

    fun start(){
        timer.start()
    }
    fun stop(){
        timer.cancel()
    }
}