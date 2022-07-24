package com.bsoft.beginnersbook.Collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class LoopExample {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(14);
        arrList.add(7);
        arrList.add(39);
        arrList.add(40);

        /* For Loop for iterating ArrayList */
        System.out.println("For Loop");

        for (int counter = 0; counter < arrList.size(); counter++) {
            System.out.println(arrList.get(counter));
        }

        /* Advanced For Loop */
        System.out.println("Advanced For Loop");
        for (Integer num : arrList) {
            System.out.println(num);
        }

        /* While Loop */
        System.out.println("While Loop");
        Iterator iter = arrList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
