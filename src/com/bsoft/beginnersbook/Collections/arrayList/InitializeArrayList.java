package com.bsoft.beginnersbook.Collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InitializeArrayList {

    public static void main(String[] args) {
        /* Method 1: Initialization using Arrays.asList
            Syntax:

                ArrayList<Type> obj = new ArrayList<Type>(
                        Arrays.asList(Object o1, Object o2, Object o3...,)
                )
        */
        ArrayList<String> obj = new ArrayList<>(
                Arrays.asList("Buhari", "Nasir", "Maiwada"));
        System.out.println("Elements are: " +obj);

        /* Method 2: Anonymous inner class method to initialize ArrayList
            Syntax:

                ArrayList<Type> obj = new ArrayList<Type>(
                        add(Object o1);
                        add(Object o2);
                        add(Object o3);
                )
         */

        ArrayList<String> cities = new ArrayList<>(){{
            add("Minneapolis");
            add("Washington DC");
            add("Tempe");
        }};
        System.out.println("Content of Array list cities: " +cities);


        /* Method 3: Normal way to initialize ArrayList
            Syntax:

                ArrayList<T> obj = new ArrayList<T>(
                        add(Object o1);
                        add(Object o2);
                        add(Object o3);
                )
         */

        ArrayList<String> books = new ArrayList<>();
                books.add("Java Book1");
                books.add("Java Book2");
                books.add("Java Book3");

        System.out.println("Books stored in array list area: " +books);


        /* Method 4: Use of Collections.ncopies
            Syntax:

                ArrayList<T> obj = new ArrayList<T>(Collections.nCopies(count, element));
         */

        ArrayList<Integer> inList = new ArrayList<>(Collections.nCopies(10,5));
        System.out.println("ArrayList items: " +inList);

    }
}
