package com.bsoft.codewithmosh.interfaces;

public class TaxReport {
    private TaxCalculator calculator;

    //Constructor injection
    public TaxReport(TaxCalculator calculator){
        this.calculator = calculator;
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    //setter injection
//    public void setCalculator(TaxCalculatorNew calculator) {
//        this.calculator = calculator;
//    }
}
