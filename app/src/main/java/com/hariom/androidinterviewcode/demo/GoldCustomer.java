package com.hariom.androidinterviewcode.demo;

public class GoldCustomer extends Customer{

    @Override
    void intrestCalculate() {
        System.out.println("GoldCustomer -> intrestCalculate");
    }

    @Override
    String calCalcuteDiscount() {
        return "2%";
    }
}
