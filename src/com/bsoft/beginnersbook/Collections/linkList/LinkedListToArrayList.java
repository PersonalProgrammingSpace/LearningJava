package com.bsoft.beginnersbook.Collections.linkList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Orange");
        linkedList.add("Banana");
        linkedList.add("PineApple");
        linkedList.add("Mango");

        List<String> list = new ArrayList<>(linkedList);

        for (String str : linkedList){
            System.out.println(str);
        }
    }
}
