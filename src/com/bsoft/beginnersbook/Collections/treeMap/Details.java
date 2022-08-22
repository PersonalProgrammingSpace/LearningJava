package com.bsoft.beginnersbook.Collections.treeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Details {
    public static void main(String[] args) {

        /* This is how to declare TreeMap */
        TreeMap<Integer, String> tMap = new TreeMap<>();


        /* Adding elements TreeMap */
        tMap.put(1, "Data1");
        tMap.put(23, "Data2");
        tMap.put(70, "Data3");
        tMap.put(4, "Data4");

        /* Display content using Iterator*/
        Set set = tMap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

    }
}
