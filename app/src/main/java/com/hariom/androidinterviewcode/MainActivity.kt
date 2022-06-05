package com.hariom.androidinterviewcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRepository = UserRepository()
        val userEmailService = EmailService()
        val userServiceRepository = UserRegistrationService(userRepository, userEmailService)
        userServiceRepository.registerUser("hemant@sstudio.inc","Hemant!!33")
    }
}