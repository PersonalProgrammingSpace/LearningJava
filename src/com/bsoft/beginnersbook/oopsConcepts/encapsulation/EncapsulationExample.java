package com.bsoft.beginnersbook.oopsConcepts.encapsulation;

public class EncapsulationExample {

    public static void main(String[] args) {

        EmployeeCount emp1 = new EmployeeCount();
        emp1.setNumOfEmployees(3491);

        System.out.println("The number of Employees is " + (int) emp1.getNumOfEmployees());

    }
}
