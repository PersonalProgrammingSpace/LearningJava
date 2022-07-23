package com.bsoft.beginnersbook.Collections.linkList;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveLinkedList {
    public static void main(String[] args) {

        LinkedList<String> str = new LinkedList<>();

        //adding elements to the LinkList
        str.add("Buhari");
        str.add("Nasir");
        str.add("Maiwada");
        str.add("Aisha");
        str.add("Maryam");
        str.add("Fatima");

        Iterator<String> it = str.iterator();
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }

        System.out.println("\nRemoving elements");

        //Removing First element
        //Same as list.remove(0)
        str.removeFirst();

        //Removing Last element
        str.removeLast();

        //iterating LinkedList
        Iterator<String> iterator = str.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }


        //Removing the second element
        str.remove(1);

        System.out.println("\nAfter removing the second element: ");

        //iterating through the list again
        Iterator<String> iterator1 = str.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next() + " ");
        }


    }
}
