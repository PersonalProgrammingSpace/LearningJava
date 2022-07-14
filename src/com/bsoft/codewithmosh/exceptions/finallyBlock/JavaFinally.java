package com.bsoft.codewithmosh.exceptions.finallyBlock;


/*

Another example of finally block and return statement
You can see that even though we have return statement in the method, the finally block still runs.

*/

public class JavaFinally {
    public static void main(String[] args) {
        System.out.println(JavaFinally.myMethod());
    }

    public static int myMethod(){
        try{
            return 122;
        }
        finally {
            System.out.println("This is Finally block");
            System.out.println("Finally block ran even after return statement");
        }
    }
}
