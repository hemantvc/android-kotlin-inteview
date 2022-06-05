package com.hariom.androidinterviewcode

fun main(args: Array<String>) {
//    var gender : String? = ""
//    gender = null
//    println(gender)
//
//    val  name = "Hariom"
//    println(gender?.length)
//    println(name.length)

    val nullValueList = listOf("Hariom",null)
    for ( item in nullValueList){
        item?.let {  println(it)}
    }
}