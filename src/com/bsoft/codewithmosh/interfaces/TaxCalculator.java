package com.bsoft.codewithmosh.interfaces;

public class TaxCalculator extends AbstractTaxCalculator implements TaxCalculatorImpl {
    private double taxableIncome;

    public TaxCalculator(double taxableIncome){
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax(){
        return taxableIncome * 0.4;
    }
}
