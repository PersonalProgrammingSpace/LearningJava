package com.bsoft.controlFlow;

public class IfStatements {
    public static void main(String[] args) {

        /**
             if temp is greater than 30;
                it's a hot day
                Drink plenty of Water
            Otherwise, if it's between 20 and 30
                It's a nice day
            Otherwise
                it's cold
         */

//        int temperature = 2;
//        if(temperature > 30){
//            System.out.println("It's a hot day, Drink plenty of water");
//        }
//        else if (temperature > 20 && temperature < 30){
//            System.out.println("It's a nice day");
//        }
//        else {
//            System.out.println("It's cold");
//        }
//

        //SIMPLIFYING IF-STATEMENT

        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);
    }
}
