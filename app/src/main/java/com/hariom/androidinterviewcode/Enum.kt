package com.hariom.androidinterviewcode

// https://www.youtube.com/watch?v=gL-3W2R5GPA&t=4s&ab_channel=CheezyCode

fun main(args: Array<String>) {
    val day = Weekdays.Sunday;
    println(day.number)
    for (i in Weekdays.values()){
        println(i)
    }

    day.formatDate()
}
enum class Weekdays(val number: Int){
    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wednesday(4),
    Thursday(5),
    Friday(6),
    Saturday(7);

    fun formatDate(){
        println("Day is $this")
    }
}