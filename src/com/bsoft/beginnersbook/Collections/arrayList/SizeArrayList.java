package com.bsoft.beginnersbook.Collections.arrayList;

import java.util.ArrayList;

public class SizeArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Number of elements in ArrayList: "+numbers.size());
    }
}
