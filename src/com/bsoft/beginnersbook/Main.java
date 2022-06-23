package com.bsoft.beginnersbook;

public class Main {

    public static void main(String[] args) {

        //Declaring Variables
//        int age = 30;
//        age = 35;

        //Copying variable
        int hisAge = 30;
        int herAge = hisAge;

        //Bytes
        byte age = 30;
//        byte viewsCount = 123_456_789; //get error because its a large number
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter  = 'A';
        boolean isEligible = false;

        System.out.println(herAge);
    }
}
