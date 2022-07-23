package com.bsoft.beginnersbook.Collections.linkList;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

public class AddLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        //adding elements to the LinkList
        list.add("Buhari");
        list.add("Nasir");
        list.add("Maiwada");

        //adding an element to the First position
        list.addFirst("Aisha");

        //adding an element to the Last position
        list.addLast("Fatima");

        //adding an element to the second position
        list.add(1, "Maryam");

        //iterating LinkList
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
