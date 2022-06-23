package com.bsoft.beginnersbook.Exercise;

import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {

        /*
             Check whether the input number(entered by user) is positive or negative
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        if(num >= 0 ){
            System.out.println(num + " is a POSITIVE number.");
        } else{
            System.out.println(num + "  is a NEGATIVE number.");

        }

    }
}
