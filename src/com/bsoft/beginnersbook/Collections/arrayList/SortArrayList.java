package com.bsoft.beginnersbook.Collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");

        for (String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println("========== SORTED ========");

        //sorting in alphabetical order
        Collections.sort(fruits);

        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
