package com.bsoft.beginnersbook.oopsConcepts.polymorphism.methodOverriding;

public class SuperMethodOverriding {
    public void myMethod(){
        System.out.println("Overridden Method");
    }
}

class Demos extends SuperMethodOverriding{
    public void myMethod(){

        //This will call the myMethod()nof parent class
        super.myMethod();
        System.out.println("Overriding Method");
    }

    public static void main(String[] args) {
        var obj = new Demos();
        obj.myMethod();
    }
}
