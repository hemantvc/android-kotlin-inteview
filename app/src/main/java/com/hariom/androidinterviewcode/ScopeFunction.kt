package com.hariom.androidinterviewcode

fun main(args: Array<String>) {
    val emp = Employee()
    emp.id =  10
    emp.name ="Hariom"
    emp.apply {
        id = 155
        name = "Asharam bapu"
    }

    var newEmp = emp.let {

    }
}

data class Employee(var id:Int = 0,var name: String = "")