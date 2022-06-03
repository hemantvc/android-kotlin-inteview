package com.hariom.androidinterviewcode

/***
 * https://www.youtube.com/watch?v=U3r-iJ0o6JY&list=PLRKyZvuMYSIMW3-rSOGCkPlO1z_IYJy3G&index=12&ab_channel=CheezyCode
 */
fun main(string: Array<String>){
//    val result = add(2,5)
//     println(result)
//    val result2 = add(1,5)
//    println(result2)
//
//    // Check number is odd or event
//    evenOrOdd(0)
//    evenOrOdd(14)

    // Default argument example
    printMessage()
//    printMessage(5)



}

//  fun printMessage(count: Int){
//    for(i in 1..count){
//        println("Hariom $i")
//    }
//   }

/**
 * Default argument
 */

fun printMessage(count: Int = 10){ // count parameter
    for(i in 1..count){
        println("Hariom $i")
    }
}

/***
    // Method 1 Simple function
    fun add(num1 : Int, num2 : Int) : Int{
        return num1 + num2
    }

    // Method 2 Inline function
      fun add(num1 : Int, num2 : Int) : Int = num1 + num2
 */
// Method 3
// remove return type from method because num1 + num2 always return Integer value
fun add(num1 : Int, num2 : Int) = num1 + num2



fun evenOrOdd(num1: Int) : Unit{
    val result = if (num1 % 2 == 0) "Even" else "Odd"
    println(result)
}