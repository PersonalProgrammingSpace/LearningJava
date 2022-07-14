package com.bsoft.codewithmosh.exceptions.finallyBlock;


/*
FINALLY BLOCK:

A finally block contains all the crucial statements that must be executed whether exception occurs or not.
The statements present in this block will always execute regardless of whether exception occurs in try block or
not such as closing a connection, stream etc.

*/

public class Example {
    public static void main(String[] args) {
        try{
            int num = 121/0;
            System.out.println();
        }
        catch(ArithmeticException e){
            System.out.println("Number should not be deivided by zero");
        }
        /* Finally block will always execute
         * even if there is no exception in try block
         */
        finally {
            System.out.println("This is finally block");
        }
        System.out.println("Out of try-catch-finally");
    }
}
