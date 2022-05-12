package com.bsoft.controlFlow;

import java.util.Locale;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /*
            The Java while loop is used to iterate a part of the program repeatedly until the specified Boolean
            condition is true. As soon as the Boolean condition becomes false, the loop automatically stops.

            The while loop is considered as a repeating if statement. If the number of iteration is not fixed,
             it is recommended to use the while loop.
        */

//        int i = 0;
//        while(i > 5){
//            System.out.println("Hello World " + i);
//            i--;
//        }

        Scanner sc = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")){
            System.out.print("Input: ");
            input = sc.next().toLowerCase(); //convert to lower case
            System.out.println(input);
        }
    }

}
