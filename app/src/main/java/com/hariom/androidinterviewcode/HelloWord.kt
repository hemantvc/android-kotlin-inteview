package com.hariom.androidinterviewcode



fun main(args: Array<String>) {
    println("Hariom")
    val number = 10
    println(number)
    val result = number in 1 until 10
    println(result)

    for ( number in (1..5) step 2 ){
        println(number)
    }
}