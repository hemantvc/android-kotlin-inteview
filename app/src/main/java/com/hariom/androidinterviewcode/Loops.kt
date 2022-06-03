package com.hariom.androidinterviewcode


fun main(args: Array<String>) {
    var count  = 5

    while (count >= 1){
        println("Hariom")
        count --
    }

    // Print  multiplication table

    val number = 5
    var index = 1
    while (index <= 10){

        println(number.toString()+"*"+index+"="+index * number)
        index ++
    }
}