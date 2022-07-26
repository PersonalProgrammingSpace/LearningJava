package com.bsoft.beginnersbook.Collections.hashMaps;

import java.util.HashMap;

public class RemoveAllMapping {

    public static void main(String[] args) {
        HashMap<Integer, String > hashMap = new HashMap<>();

        //Adding key and value pairs for key 33
        hashMap.put(11, "Value1");
        hashMap.put(22, "Value2");
        hashMap.put(33, "Value3");
        hashMap.put(44, "Value4");
        hashMap.put(55, "Value5");

        //Displaying hasMap Elements
        System.out.println("HashMap Elements: " +hashMap);

        //Removing all Mapping
        hashMap.clear();

        //Displaying HashMap Elements after remove
        System.out.println("After Remove:");
        System.out.println("--------------");
        System.out.println("HashMap Elements: " +hashMap);
    }
}
