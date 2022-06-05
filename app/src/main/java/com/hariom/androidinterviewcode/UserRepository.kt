package com.hariom.androidinterviewcode

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){

    fun saveUser(email : String, password : String){
        Log.d("UserRegister", "User save in DB! ")
    }
}