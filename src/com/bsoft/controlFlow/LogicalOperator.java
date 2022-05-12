package com.bsoft.controlFlow;

public class LogicalOperator {

    public static void main(String[] args) {

//        //AND OPERATOR
//        int temperature = 22;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);

//        //OR OPERATOR
//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean isEligible = hasHighIncome || hasGoodCredit;
//        System.out.println(isEligible);

        //NOT OPERATOR
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && hasCriminalRecord;
        System.out.println(isEligible);
    }
}
