package com.hariom.androidinterviewcode

fun main(args: Array<String>) {
//    var name : String? = "Hariom"
//    name = null
//    println(name?.length)
    // Elvis operator ?:
//    var name : String? = "Hemant"
//    name = null
//    var result = name?.length ?: -1
//    println("$result")


    // destructuring in Kotlin?
    var (name, address) = Developer("Hariom","Surat")
    println(name)
    println(address)
}

data class Developer(val name : String,val address : String)