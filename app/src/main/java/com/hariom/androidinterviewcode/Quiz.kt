package com.hariom.androidinterviewcode
fun main() {
    var name : String? = "Hariom"
    //name = null
    //	name.length
    println("$name")
    // 10, 1, 2, 3, 4, 5 // true
    // 1, 2, 3, 4, 99, 5, 6 = true
    // 0, -2, 5, 6
//    var list = mutableListOf(1, 2, 3, 4, 99,  5, 6)
//    var list = mutableListOf(1, 3, 2, 1) // false
    val list = mutableListOf(1, 2, 3, 4, 5, 3, 5, 6) // false
//    val list = mutableListOf(0, -2, 5, 6) // true

    //println(solution(list))
    var s1 : String = "Hari"
    var s2 : String = "Om"
    
}

fun solution(sequence: MutableList<Int>): Boolean {
    var result = false
    var count = 0
    var previousValue = 0
    for ((index, value) in sequence.withIndex()) {
        val nextIndex = index + 1
        if (nextIndex != sequence.size){

            if (previousValue == 0){
                previousValue = value
            }
            if (value < sequence[nextIndex] && value > previousValue){
                println("lastValue $value element $value")
                result = true
                previousValue = value
            } else {
                println("element $value")
                if (count == 2){
                    return  false
                }
                count ++

            }
        }
    }



    return result
}
