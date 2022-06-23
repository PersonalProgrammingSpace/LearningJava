package com.bsoft.beginnersbook.controlFlow;

public class ForEachLoop {

    public static void main(String[] args) {

        String [] fruits = {"Apple", "Orange", "Mango"};

        //Traditional For Loop
        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        System.out.println("====================================");
        //For Each loop is used to iterate through Arrays and Collections.
        //Cons: we cant acess the index of each items with ForEach loop.

        for (String fruit : fruits)
            System.out.println(fruit);

    }
}
