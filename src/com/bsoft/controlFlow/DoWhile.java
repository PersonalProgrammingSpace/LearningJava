package com.bsoft.controlFlow;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = "";
        do{
            System.out.print("Input: ");
            input = sc.next().toLowerCase(); //convert to lower case
            System.out.println(input);
        }while(!input.equals("quit"));
    }
}
