package com.bsoft.beginnersbook.Collections.hashMaps;

import java.util.HashMap;

public class HashMapGetSize {

    public static void main(String[] args) {
        //Creating a HashMap of int keys and sorting values
        HashMap<Integer, String> hashMap = new HashMap<>();

        //Adding Key and Value pairs to HashMap
        hashMap.put(11, "Value1");
        hashMap.put(22, "Value2");
        hashMap.put(33, "Value3");
        hashMap.put(44, "Value4");
        hashMap.put(55, "Value5");

        //int size() method returns the number of key value pairs
        System.out.println("Size of HashMap: " +hashMap.size());
    }
}
