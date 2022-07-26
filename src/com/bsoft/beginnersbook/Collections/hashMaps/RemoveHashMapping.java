package com.bsoft.beginnersbook.Collections.hashMaps;

import java.util.HashMap;

public class RemoveHashMapping {
    public static void main(String[] args) {

        //creating a HashMap of int keys and string values
        HashMap<Integer, String> hashMap = new HashMap<>();

        //Adding key and value pairs for key 33
        hashMap.put(11, "Value1");
        hashMap.put(22, "Value2");
        hashMap.put(33, "Value3");
        hashMap.put(44, "Value4");
        hashMap.put(55, "Value5");

        //Displaying HashMap Elements
        System.out.println("HashMap Elements: " +hashMap);

        //Removing Key-Value pairs for key 33
        Object removedElement1 = hashMap.remove(33);
        System.out.println("Element removed is: " +removedElement1);

        //Removing Key-Value pairs for 55
        Object removeElement2 = hashMap.remove(55);
        System.out.println("Element removed is: "+removeElement2);

        //Displaying HashMap Elements after remove
        System.out.println("After Remove:");
        System.out.println("--------------");
        System.out.println("HashMap Elements: " +hashMap);
    }
}
