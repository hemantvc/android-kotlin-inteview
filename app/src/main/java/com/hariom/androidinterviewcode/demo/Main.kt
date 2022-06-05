package com.hariom.androidinterviewcode.demo

import kotlin.jvm.JvmStatic

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val customer : Customer
        val goldCustomer = GoldCustomer()

        println( goldCustomer.calCalcuteDiscount())
    }
}