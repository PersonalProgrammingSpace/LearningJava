package com.bsoft.beginnersbook.Collections.linkList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListLoop {


    public static void main(String[] args) {
        /* LinkedList declaration */
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Orange");
        linkedList.add("Banana");
        linkedList.add("PineApple");
        linkedList.add("Mango");

        /* For Loop */
        System.out.println("For Loop");
        for(int i = 0; i < linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }

        /* Advance For Loop */
        System.out.println("Advanced For Loop");
        for(String str : linkedList){
            System.out.println(str);
        }

        /* Using Iterator */
        System.out.println("Using Iterator ");
        Iterator iterator = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /* Using while loop */
        System.out.println("While Loop ");
        int num = 0;
        while(linkedList.size() > num){
            System.out.println(linkedList.get(num));
            num++;
        }
    }

}
