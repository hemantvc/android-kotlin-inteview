package com.hariom.androidinterviewcode.demo;

abstract class Customer {
    String customerName;
    String customerAddress;

    abstract String calCalcuteDiscount();

    void intrestCalculate(){
        System.out.println("interstCalculate");
    }
}
