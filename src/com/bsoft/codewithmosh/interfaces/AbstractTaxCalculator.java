package com.bsoft.codewithmosh.interfaces;

public abstract class AbstractTaxCalculator  implements  TaxCalculatorImpl{

    double getTaxableIncome(double income, double expenses){
        return  income - expenses;
    }
}
