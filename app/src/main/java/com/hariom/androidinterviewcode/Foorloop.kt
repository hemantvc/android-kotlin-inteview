package com.hariom.androidinterviewcode

/**
 * https://www.youtube.com/watch?v=RmqXF8cn0p4&list=PLRKyZvuMYSIMW3-rSOGCkPlO1z_IYJy3G&index=11&ab_channel=CheezyCode
 */
fun main(args: Array<String>) {
//    for (i in 1..5 step 2) {
//        println(i)
//    }

//    for (i in 1 until 5){
//        println(i)
//    }
//    for (i in 10 downTo  1){
//        println(i)
//    }

    val  number = 2
    for (i in 1..10){
//        println(number.toString()+" * "+ i +" = "+(i*number))
        // String templating
        println("$number * $i = ${ number * i}")
    }
}