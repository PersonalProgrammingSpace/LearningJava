package com.bsoft.beginnersbook.javaStatic;

public class StaticClass {

    /*
    Static Class
        A class can be made static only if it is a nested class.
            Nested static class doesn’t need reference of Outer class
            A static class cannot access non-static members of the Outer class

        We will see these two points with the help of an example:

        Static class Example
   */

    private static String str = "BeginnersBook";

    //Static class
    static class MyNestedClass{
        //non-static method
        public void disp(){

            /* If you make the str variable of outer class
             * non-static then you will get compilation error
             * because: a nested static class cannot access non-
             * static members of the outer class.
             */

            System.out.println(str);
        }
    }

    public static void main(String[] args) {

        /* To create instance of nested class we didn't need the outer
         * class instance but for a regular nested class you would need
         * to create an instance of outer class first
         */

        StaticClass.MyNestedClass obj = new StaticClass.MyNestedClass();

        obj.disp();
    }
}
