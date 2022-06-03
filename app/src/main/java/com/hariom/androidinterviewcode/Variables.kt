package com.hariom.androidinterviewcode

/**
 * This is VAR & VAl
 * Once variable size define can't change later
 *
 */

fun main(args: Array<String>) {
    // Type inference
    // ctrl+p
    var score = 5
    score = 20

    println("score: "+score)

    val message = "Hariom"
    // message = "Hare Krisna" // Give error
    println(message)


    var scoreInt : Int = 10
    var intrest : Double = 10.5


}
