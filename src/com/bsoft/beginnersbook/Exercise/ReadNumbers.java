package com.bsoft.beginnersbook.Exercise;

import java.util.Scanner;

public class ReadNumbers {

    public static void main(String[] args) {

        /*
                Example: Program to read the number entered by user.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer number: ");

        int num = sc.nextInt();

        sc.close();;

        System.out.println("The number you've entered is: " + num);
    }
}
