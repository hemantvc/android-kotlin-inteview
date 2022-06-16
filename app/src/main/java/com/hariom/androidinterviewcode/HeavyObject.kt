package com.hariom.androidinterviewcode

class HeavyObject {
    fun printMessage(){
        println("This message from heavy object")
    }
}

fun main(args: Array<String>) {
    val heavyObject = HeavyObject()
    heavyObject.printMessage()
    println("$heavyObject")
    heavyObject.printMessage()
    println("$heavyObject")
}