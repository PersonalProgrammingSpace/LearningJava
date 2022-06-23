package com.bsoft.beginnersbook;

public class Casting {
    public static void main(String [] args){
        //Implicit casting
        // byte > short > int > long > float > double
//        short x = 1;
//        int y = x + 2;
//        System.out.println(y);
//
//        double x = 1.1;
//        double y = x + 2;
//        System.out.println(y);

        // Explicitly casting
//        double x = 1.1;
//        int y = (int)x + 2;
//        System.out.println(y);

        // Casting String using wrapper class
//        String x = "1";
//        int y = Integer.parseInt(x) + 2;
//        System.out.println(y);

        String x = "1.1";
        double y = Double.parseDouble(x) + 2;
        System.out.println(y);
    }
}
