package com.bsoft.beginnersbook.Collections.LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // HashMap Declaration
        LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<>();

        // Adding elements to LinkedHashMap
        lhmap.put(59, "Buhari");
        lhmap.put(22, "Abey");
        lhmap.put(33, "Dawn");
        lhmap.put(1, "Sherry");
        lhmap.put(2, "Karon");
        lhmap.put(100, "Jim");

        // Generating a Set of enteries
        Set set = lhmap.entrySet();

        //Displaying elements of LinkedHashMap

        Iterator iterator= set.iterator();
        while(iterator.hasNext()){
            Map.Entry map = (Map.Entry) iterator.next();
            System.out.print("Key is: " + map.getKey() + " & Value is: " +map.getValue()+ "\n");
        }



    }
}
