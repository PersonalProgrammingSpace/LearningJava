package com.bsoft.controlFlow;

public class ForLoop {
    public static void main(String[] args) {

        /*
            FOR LOOP is used to iterate a part of the program several times.
            if a number of iteration is fixed, it is recommended to used FOR-LOOP.
        */

        for(int i = 1; i <= 5; i++){
            System.out.println("Hello World " + i);
        }

        System.out.println("TO REVERSE: ");

        for(int i = 5; i > 0; i--){
            System.out.println("Hello World " + i);
        }
    }
}
