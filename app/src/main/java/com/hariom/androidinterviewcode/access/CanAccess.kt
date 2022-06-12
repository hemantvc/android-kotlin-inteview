package com.hariom.androidinterviewcode.access

import com.hariom.androidinterviewcode.AccessModifier

class CanAccess() {
    var accessModifier = AccessModifier()
    fun canAccessMethod(){
        println("CanAccess method")
    }
}

fun main(args: Array<String>) {
    val accessModifier = AccessModifier()
    accessModifier.accessMethodScope()

}