package com.bsoft;

import java.text.NumberFormat;

public class NumFormat {
    public static void main(String[] args) {
        // CURRENCY
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.891);
//        System.out.println(result);


        //PERCENTAGE
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }
}

