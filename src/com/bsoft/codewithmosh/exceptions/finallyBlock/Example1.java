package com.bsoft.codewithmosh.exceptions.finallyBlock;

/*

Examples of Try catch finally blocks

Example 1: The following example demonstrate the working of finally block when no exception occurs in try block

 */

public class Example1 {
    public static void main(String[] args) {

        try{
            System.out.println("First statement of try block");
            int num = 45/3;
            System.out.println(num);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("Out of try-catch-finally block");
    }
}

/*

Example 2: This example shows the working of finally block when an exception occurs in try block but is not handled in
the catch block:

*/

class Example2{
    public static void main(String[] args) {
        try{
            System.out.println("First statement of try block");
            int num = 45/0;
            System.out.println(num);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("Out of try-catch-finally block");
    }
}

/*
Output:

First statement of try block
finally block
Exception in thread "main" java.lang.ArithmeticException: / by zero
at beginnersbook.com.Example2.main(Details.java:6)
As you can see that the system generated exception message is shown but before that the finally block
successfully executed.
*/

/* Example 3: When exception occurs in try block and handled properly in catch block */

class Example3{
    public static void main(String[] args) {
        try{
            System.out.println("First statement of try block");
            int num = 45/0;
            System.out.println(num);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        finally {
            System.out.println("finally block");
        }

        System.out.println("Out of try-catch-finally block");
    }
}