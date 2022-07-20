package com.bsoft.beginnersbook.Collections.arrayList;

import java.util.ArrayList;

public class RemoveElements {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("Buhari");
        alist.add("Nasir");
        alist.add("Maiwada");
        alist.add("Fatima");


        //displaying elements
        System.out.println(alist);
        //Adding Yusuf at fourth position
        alist.remove("Fatima");

        System.out.println(alist);
        alist.remove(1);

        //displaying all elements
        System.out.println(alist);
    }
}
