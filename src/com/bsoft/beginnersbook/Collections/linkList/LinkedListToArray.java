package com.bsoft.beginnersbook.Collections.linkList;

import java.util.LinkedList;

//How To convert LinkedList to array using toArray().
public class LinkedListToArray {

    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();
           fruits.add("Apple");
           fruits.add("Orange");
           fruits.add("Banana");
           fruits.add("PineApple");
           fruits.add("Mango");

           //Converting LinkedList To Array
        String [] array = fruits.toArray(new String [fruits.size()]);

        //Displaying Array content
        System.out.println("Array Element");
        for(int  i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
