package com.bsoft.beginnersbook.ifElseStatement;

import java.util.Scanner;

public class LargestNumber {
    /* Program to find the largest number of three numbers */
    public static void main(String[] args) {
        int num1 = 79, num2 = 8, num3 = 65;

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is greater");
        } else if (num2 >= num1 && num2 >= num3){
            System.out.println(num2 + " is greater");
        }else {
            System.out.println(num3 + " is greater");
        }

        /* Ask a user to input number */
        System.out.println("Using Input from the USER");

        int numb1, numb2, numb3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");

        numb1 = sc.nextInt();
        numb2 = sc.nextInt();
        numb3 = sc.nextInt();

        if (numb1 >= numb2 && numb2 >= numb3){
            System.out.println(numb1 + " is greater.");
        } else if (numb2 >= numb1 && numb2 >= numb3) {
            System.out.println(numb2 + " is greater.");
        } else {
            System.out.println(numb3 + " is greater.");
        }


    }
}
