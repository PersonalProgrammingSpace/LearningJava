package com.bsoft.beginnersbook.controlFlow;

public class TernaryOperator {

    public static void main(String[] args) {
        int income = 120_000;
        String className = income > 100_000 ? "First": "Ecomnomy"; //Ternary Operator.

//        if (income > 100_000)
//            className = "First";
//        else
//            className = "Economy";
        System.out.println(className);
    }

}
