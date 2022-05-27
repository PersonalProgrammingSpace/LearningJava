package com.bsoft.beginnersbook;

import java.util.Scanner;

public class WriteName {
     public static void main(String[] args){

       String userName;

       Scanner s = new Scanner(System.in);

       System.out.print("Please enter your name");
       userName = s.nextLine();

       for (int i = 0; i < userName.length(); i++){
           System.out.println(userName.charAt(i));
       }
     }
   }