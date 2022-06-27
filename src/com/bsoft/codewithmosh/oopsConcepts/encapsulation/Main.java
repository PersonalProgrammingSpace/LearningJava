package com.bsoft.codewithmosh.oopsConcepts.encapsulation;

public class Main {
    public static void main(String[] args) {
        new Employee(10_000);
        Employee employee = new Employee(50_000, 20);

        System.out.println(Employee.numOfEmployees);
        Employee.printNumberOfEmployees();

        employee.getBaseSalary();

        employee.getHourlyRate();

        employee.setExtraHours(20);
        employee.setExtraHours(20);

        int wage = employee.calculateWage();

        System.out.println(wage);
    }
}
