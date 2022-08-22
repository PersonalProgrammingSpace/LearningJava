package com.bsoft.beginnersbook.Collections.hashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        /* This is how to declared HashMap */
        HashMap<Integer, String> hmap = new HashMap<>();

        /* Adding elements to HashMap */
        hmap.put(37, "Buhari");
        hmap.put(1, "Aisha");
        hmap.put(72, "Nasir");
        hmap.put(29, "Maryam");
        hmap.put(60, "Fatima");
        hmap.put(85, "Maiwada");

        /* Display content using Iterator */
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            System.out.println("Key is: " + mapEntry.getKey() +
                    " & Value is: "
                    + mapEntry.getValue());
        }

        /* Get the value based on the key */
        String var = hmap.get(72);
        System.out.println("Value at index 72 is: " +var);

        /* Remove values based on key */
        hmap.remove(72);
        System.out.println("Map key and values after removal: ");
        Set set1 = hmap.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            Map.Entry mEntry = (Map.Entry)iterator1.next();
            System.out.println("Key is: " +mEntry.getKey() + " & Value is: " +mEntry.getValue());
        }
    }
}
