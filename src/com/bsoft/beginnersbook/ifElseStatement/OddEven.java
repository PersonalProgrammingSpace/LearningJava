package com.bsoft.beginnersbook.ifElseStatement;

import java.util.Scanner;

public class OddEven {

    /* Java Program to Check Whether a Number is Even or Odd */

    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " Is Even Number.");
        } else if (num % 2 != 0) {
            System.out.println(num + " Is Odd Number.");
        } else {
            System.out.println(num + " Is an invalid Integer Number. ");
        }


        System.out.println("Using Ternary");

        System.out.println("Enter a Number: ");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        String evenOdd = (numb % 2 == 0 ) ? "Even Number " : "Odd Number";
    }
}
