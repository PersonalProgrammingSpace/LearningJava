package com.bsoft.beginnersbook.Collections.arrayList;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("Buhari");
        alist.add("Nasir");
        alist.add("Maiwada");
        alist.add("Fatima");

        //iterating ArrayList
        for(String names : alist){
            System.out.println(names);
        }
    }


}
