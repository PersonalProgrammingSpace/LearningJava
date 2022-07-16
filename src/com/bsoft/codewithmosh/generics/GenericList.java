package com.bsoft.codewithmosh.generics;

public class GenericList <T>{
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }
}

class MainDriver{
    public static void main(String[] args) {
        var list = new GenericList<User>();
        list.add(new User());
        User user = list.get(0);
    }
}
