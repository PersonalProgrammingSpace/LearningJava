package com.bsoft.beginnersbook.Collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class EnumExample {
    public static void main(String[] args) {
        //create an ArrayList object
        ArrayList<String> obj = new ArrayList<>();

        obj.add("Java");
        obj.add("C+");
        obj.add("Python");
        obj.add("DotNet");
        obj.add("Perl");
        obj.add("C");

        //Get the Enumeration obj
        Enumeration<String> e = Collections.enumeration(obj);

        //Enumeration through the ArrayList elements
        System.out.println("ArrayList elements: ");
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
