package com.hariom.androidinterviewcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

/**
 * https://www.youtube.com/watch?v=vcr-wW50t8g&list=PLRKyZvuMYSIPwjYw1bt_7u7nEwe6vATQd&index=3&ab_channel=CheezyCode
 */
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()
        component.inject(this)
        userRegistrationService.registerUser("hemant@sstudio.inc","Hemant!!33")
    }
}