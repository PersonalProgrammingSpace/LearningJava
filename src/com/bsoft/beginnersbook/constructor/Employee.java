package com.bsoft.beginnersbook.constructor;


//Example of using Parameterized constructor
public class Employee {

    int empId;
    String empName;

    //PARAMETERIZED CONSTRUCTOR
    Employee(String name, int id){
        this.empName= name;
        this.empId = id;
    }

    void info(){
        System.out.println("Id: " +empId + " Name: " +empName);
    }

    public static void main(String[] args) {

        Employee obj1 = new Employee("Buhari", 1598);
        Employee obj2 = new Employee("John", 1234);
        obj1.info();
        obj2.info();
    }
}
