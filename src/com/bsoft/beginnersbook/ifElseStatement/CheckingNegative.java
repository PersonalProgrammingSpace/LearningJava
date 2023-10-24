package com.bsoft.beginnersbook.ifElseStatement;

import java.util.Scanner;

public class CheckingNegative {
    /* Java Program to check if Number is Positive or Negative */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = sc.nextInt();

        if (num >= 0){
            System.out.println(num + " is a POSITIVE number.");
        } else if (num < 0 ){
            System.out.println(num + " is a NEGATIVE number");
        } else{
            System.out.println("Invalid number");
        }
    }

}
