package com.bsoft.beginnersbook.Collections.hashMaps;

import java.util.HashMap;

public class HashMapIsEmptyOrNot {

    public static void main(String[] args) {

        HashMap<Integer, String > hashMap = new HashMap<>();

        /* Checking whether HashMap is empty or not
           isEmpty() method signature and description -
           public bpplean isEmpty(): Returns true if this map
           contains no key-value mappings
        */

        System.out.println("Is HashMap Empty? " +hashMap.isEmpty());

        //Adding key and value pairs
        hashMap.put(11, "Value1");
        hashMap.put(22, "Value2");
        hashMap.put(33, "Value3");
        hashMap.put(44, "Value4");
        hashMap.put(55, "Value5");

        System.out.println("Is HashMap Empty? " +hashMap.isEmpty());

    }
}
