package com.bsoft.codewithmosh.generics;

public class List {

    private int[] items = new int[10];
    private int count;

    public void add(int item){
        items[count++] = item;
    }

    public int get(int index){
        return items[index];
    }
}

class Main{
    public static void main(String[] args) {
        var list = new List();
        list.add(1);
    }
}
