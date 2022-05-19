package com.bsoft.beginnersbook;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        /*  Sum of two numbers using Scanner */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");

        int num1, num2, sum;
        num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        num2 = sc.nextInt();

        sum = num1 + num2;

        System.out.println("The sum of the two numbers is: " + sum);

    }
}
