package com.bsoft.beginnersbook.Collections.arrayList;

import java.util.ArrayList;

public class ChangeElements {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jim");
        names.add("Jack");
        names.add("Ajeet");
        names.add("Chatanya");

        System.out.println(names);

        //updating string at index 0
        names.set(0, "Lucy");

        System.out.println(names);
    }
}
