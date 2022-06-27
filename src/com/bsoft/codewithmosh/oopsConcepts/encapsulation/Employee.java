package com.bsoft.codewithmosh.oopsConcepts.encapsulation;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    private int extraHours;

    public static int numOfEmployees;
    public Employee(int baseSalary){
        this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate){
        setExtraHours(baseSalary);
        setHourlyRate(hourlyRate);
        numOfEmployees++;
    }

    public static void printNumberOfEmployees(){
        System.out.println(numOfEmployees);
    }

    public int calculateWage(int extraHours){
        return baseSalary + (getHourlyRate() * extraHours);
    }

    public int calculateWage(){
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if(hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate most be more than 0");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setExtraHours(int extraHours){
        this.extraHours = extraHours;
    }

    public int getExtraHours(){
        return extraHours;
    }
}
