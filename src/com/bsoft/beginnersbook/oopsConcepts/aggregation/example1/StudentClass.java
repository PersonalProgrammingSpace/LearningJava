package com.bsoft.beginnersbook.oopsConcepts.aggregation.example1;

public class StudentClass {

    int rollNum;
    String studentName;

    //Creating HAS-A relationship with Address class
    Address studentAddr;
    StudentClass(int roll, String name, Address addr){
        this.rollNum = roll;
        this.studentName = name;
        this.studentAddr = addr;
    }

    public static void main(String[] args) {
        Address ad = new Address(7211, "Lanham", "MD", "USA");
        StudentClass std = new StudentClass(419, "Buhari", ad);

        System.out.println(std.rollNum);
        System.out.println(std.studentName);
        System.out.println(std.studentAddr.streetNum);
        System.out.println(std.studentAddr.city);
        System.out.println(std.studentAddr.state);
        System.out.println(std.studentAddr.country);

        /*

        The above example shows the Aggregation between Student and Address classes. You can see that in Student class
        I have declared a property of type Address to obtain student address. Its a typical example of Aggregation in Java

        */
    }


}
