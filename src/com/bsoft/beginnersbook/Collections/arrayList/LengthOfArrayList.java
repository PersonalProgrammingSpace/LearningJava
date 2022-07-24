package com.bsoft.beginnersbook.Collections.arrayList;

import java.util.ArrayList;

public class LengthOfArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> len = new ArrayList<>();
        len.add(2);
        len.add(1);
        len.add(0);
        len.add(6);
        len.add(4);
        len.add(5);
        System.out.println("Size after few additions: " +len.size());

        len.remove(2);
        len.remove(1);
        System.out.println("Size after remove operation: " +len.size());

        System.out.println("Final ArrayList: ");
        for(int num : len){
            System.out.println(num);
        }
    }
}
