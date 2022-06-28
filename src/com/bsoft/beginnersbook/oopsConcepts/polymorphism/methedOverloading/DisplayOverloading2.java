package com.bsoft.beginnersbook.oopsConcepts.polymorphism.methedOverloading;


// Example 2: Overloading – Difference in data type of parameters
public class DisplayOverloading2 {
    public void disp(char c){
        System.out.println(c);
    }
    public void disp(int c){
        System.out.println(c);
    }
}

class Sample2{
    public static void main(String[] args) {
        var obj = new DisplayOverloading2();
        obj.disp('a');
        obj.disp( 23);
    }
}
