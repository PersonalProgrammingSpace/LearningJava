package com.bsoft.beginnersbook.Collections.hashMaps;

import java.util.*;

public class HashMapSort {
    //HashMap Sorting by Keys

    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");

        System.out.println("Before Sorting: ");
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.println(me.getKey() + ": " +me.getValue());

        }

        Map<Integer, String> map = new TreeMap<>(hmap);
        System.out.println("After Sorting");
        Set set2 = map.entrySet();
        Iterator iterator1 = set2.iterator();
        while(iterator1.hasNext()){
            Map.Entry me2 = (Map.Entry) iterator1.next();
            System.out.println(me2.getKey() + ": " +me2.getValue());

        }


    }
}

class SortingByValues{
    public static void main(String[] args) {

        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");

        System.out.println("Before Sorting");
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.println(me.getKey()+ ": " +me.getValue());
        }

        Map<Integer, String> map = sortByValues(hmap);
        System.out.println("After Sorting");
        Set set1 = map.entrySet();
        Iterator iterator1 = set1.iterator();
        while(iterator1.hasNext()){
            Map.Entry me2 = (Map.Entry) iterator1.next();
            System.out.println(me2.getKey() +": " + me2.getValue());
        }
    }

    private static HashMap sortByValues(HashMap map){
        List list = new LinkedList(map.entrySet());
        //Define Custom Comparator here
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2){
                return ((Comparable) ((Map.Entry)(o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        //Here I am copying the sorted list in HashMap
        //using LinkedHashMap to preserve the insertion order
        HashMap sortedHashMap = new LinkedHashMap();
        for(Iterator it = list.iterator(); it.hasNext();){
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }
}
