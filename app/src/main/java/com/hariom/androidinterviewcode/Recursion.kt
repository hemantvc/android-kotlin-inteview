package com.hariom.androidinterviewcode

// Hariom
// Recursion
fun main(args: Array<String>) {
    printNumber(5)
}

fun printSum(i : Int, n : Int,sum : Int){
var add = 0
    if (i==n){
        return
    }else{
        add += i
    }
}
fun printNumber(n : Int){
    if (n==0){
        return
    }else{
        println(n)
        printNumber(n-1)
    }

}

