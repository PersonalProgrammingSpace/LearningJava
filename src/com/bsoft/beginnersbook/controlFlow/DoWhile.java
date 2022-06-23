package com.bsoft.beginnersbook.controlFlow;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        /*
            The Java do-while loop is used to iterate a part of the program repeatedly, until the specified condition is true.
            If the number of iteration is not fixed and you must have to execute the loop at least once,
            it is recommended to use a do-while loop.
        */
        Scanner sc = new Scanner(System.in);
        String input = "";
        do{
            System.out.print("Input: ");
            input = sc.next().toLowerCase(); //convert to lower case
            System.out.println(input);
        }while(!input.equals("quit"));
    }
}
