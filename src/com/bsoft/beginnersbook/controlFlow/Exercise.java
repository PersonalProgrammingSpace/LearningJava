package com.bsoft.beginnersbook.controlFlow;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        /*
            FizzBuzz exercise
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");

        int number = sc.nextInt();

        //Using IF - ELSE statement
        if(number % 3 == 0 && number % 5== 0 )
            System.out.println("FizzBUzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);


    }
}
