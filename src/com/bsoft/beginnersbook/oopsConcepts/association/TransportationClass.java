package com.bsoft.beginnersbook.oopsConcepts.association;

public class TransportationClass {
    public static void main(String[] args) {
        Driver obj = new Driver("Andy", "Ford", 9988);
        System.out.println(obj.driverName + " is the driver of car with Id Number: " + obj.carId);

        /*

        In the above example, there is a one to one relationship(Association) between two classes:
        CarClass and Driver. Both the classes represent two separate entities.

        */
    }
}
