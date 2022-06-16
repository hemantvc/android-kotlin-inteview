package com.hariom.androidinterviewcode

class LateInitExample {
     lateinit var gender: String
}
fun main(args: Array<String>) {

    var lateInitExample = LateInitExample()
    println("$lateInitExample.gender ")
}