package com.bsoft.beginnersbook.javaStatic;

public class StaticMethods {

    //EXAMPLE 1
    //static method main is accessing static variables without object
//    static int i = 10;
//    static String s = "BeginnersBook";
//
//    //This is a static method
//    public static void main(String[] args) {
//        System.out.println("i: " +i);
//        System.out.println("s: " +s);
//    }

    //EXAMPLE 2
    //Static method accessed directly in static and non-static method
    static int i = 10;
    static String s = "BeginnersBook";

    //static method
    static void disp(){
        System.out.println("i: " +i);
        System.out.println("s: " +s);
    }

    //non-static method
    void funcn(){

        //static method called in non-static method
        disp();
    }
    //This is a static method
    public static void main(String[] args) {

        StaticMethods obj = new StaticMethods();
        //You need to have object to call this non-static method
        obj.funcn();

        //Static method called in another static method
        disp();
    }
}
