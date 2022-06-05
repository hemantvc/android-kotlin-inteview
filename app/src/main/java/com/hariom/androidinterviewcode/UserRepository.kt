package com.hariom.androidinterviewcode

import android.util.Log

class UserRepository {

    fun saveUser(email : String, password : String){
        Log.d("UserRegister", "User save in DB! ")
    }
}