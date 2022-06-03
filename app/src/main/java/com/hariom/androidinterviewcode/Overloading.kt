package com.hariom.androidinterviewcode

/***
 * https://www.youtube.com/watch?v=NvQTAcVnsq0&list=PLRKyZvuMYSIMW3-rSOGCkPlO1z_IYJy3G&index=13&ab_channel=CheezyCode
 */
fun main(args: Array<String>) {
    val result = addition(2,6)
    println(result)

    val resultDouble = addition(20.51,6.6)
    println(resultDouble)

    // Named argument
    // Change argument position
    val nameArgumentResult = addition( b = 1.55,a=3.45,)
    println(nameArgumentResult)
}

fun addition(a : Int, b : Int) : Int {
    return  a + b
}

fun addition(a : Double, b : Double) : Double {
    return  a + b
}



