package com.hariom.androidinterviewcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * https://www.youtube.com/watch?v=vcr-wW50t8g&list=PLRKyZvuMYSIPwjYw1bt_7u7nEwe6vATQd&index=3&ab_channel=CheezyCode
 */
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRegistrationComponent = DaggerUserRegistrationComponent.builder().build().getUserRegistrationService()
        userRegistrationComponent.registerUser("hemant@sstudio.inc","Hemant!!33")
    }
}