package com.hariom.androidinterviewcode

/**
 * https://www.youtube.com/watch?v=izzJqv9cfJg&list=PLRKyZvuMYSIMW3-rSOGCkPlO1z_IYJy3G&index=9&ab_channel=CheezyCode
 */
fun main(args: Array<String>) {
    val number = 5

     val result = number in 1..5 // 1 2 3 4 5
     println(result)

    // upper bound not included

    val uperBound = number in 1 until 5
    println(uperBound)

    // If else
    val animal = "Dog"
    if (animal ==   "Horse"){
        println("Animal is Horse")
    }else if (animal ==   "Cow"){
        println("Animal is Hourse")
    }else {
        println("Animal not found")
    }

    // If else condition replace bu when

    when(animal){
        "Horse"->  println("Animal is Horse")
        "Cow" ->  println("Animal is Cow")
        else -> println("Animal not found")
    }

    // When as expression

    val resultOfWhen = when(animal){
        "Horse"->  "Animal is Horse"
        "Cow" ->  "Animal is Cow"
        else ->  "Animal not found"
    }

    println("resultOfWhen : "+ resultOfWhen)

    // When in range

    val numberWhen2 = 17
    val resultOfWhen2 = when(numberWhen2){
        11 -> "Eleven"
        12 -> "Twelve"
        13 -> "Thirteen"
        in 14..20-> "In range of 14 to 20"
        else -> "Number not found"
    }
    println(resultOfWhen2)


}