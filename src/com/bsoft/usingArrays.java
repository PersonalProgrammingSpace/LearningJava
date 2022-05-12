package com.bsoft;
import java.util.Arrays;
import java.util.Scanner;


public class usingArrays {

    public  static void main(String[] args){
        //Older way of initializing Arrays
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        System.out.println(Arrays.toString(numbers));

//        //Shorter way
//        int[] numbers = {2, 3, 5, 1, 4};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

        //MULTI-DIMENSIONAL ARRAYS
//        int [][] numbers = new int [2][3];
//        numbers[0][0] = 1;

//        int [][] numbers = {{1, 2, 3}, {4, 5, 6}};
//
//        System.out.println(Arrays.deepToString(numbers));

        String str, rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");

        str = sc.nextLine();
        int length = str.length();

        for (int i = length - 1; i >= 0; i--)
            rev = rev + str.charAt(i);
        if (str.equals(rev))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");

    }
}
