package com.bsoft.beginnersbook.Collections.arrayList;

import java.util.ArrayList;

public class JavaExample {

    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("Maiwada");
        obj.add("Fatima");
        obj.add("Nasir");
        obj.add("Buhari");

        System.out.println("Original ArrayList");
        for(String str : obj){
            System.out.println(str);
        }

        obj.add(0, "Maryam");
        obj.add(1, "Aisha");

        System.out.println("ArrayList after add operation");
        for(String str : obj){
            System.out.println(str);
        }

        obj.remove("Fatima");
        obj.remove("Aisha");

        System.out.println("ArrayList after remove operation");
        for(String str : obj){
            System.out.println(str);
        }

        obj.remove(1);

        System.out.println("Final ArrayList");
        for(String str : obj){
            System.out.println(str);
        }


    }


}
