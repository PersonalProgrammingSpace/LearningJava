package com.bsoft.controlFlow;

import java.util.Scanner;

public class BreakAndContinue {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = "";
            while (true){
                System.out.print("Input: ");
                input = sc.next().toLowerCase(); //convert to lower case
                if(!input.equals("quit"))
                    continue;;
                if(input.equals("quit"))
                    break;
                    System.out.println(input);
            }
        }
}
