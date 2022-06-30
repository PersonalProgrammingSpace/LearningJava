package com.bsoft.beginnersbook.oopsConcepts.polymorphism.methodOverriding;

public class Human {
    //Overriden method
    public void eat(){
        System.out.println("Human is eating ");
    }
}

class Boy{
    //Overring method
    public void eat(){
        System.out.println("Boy is eating");
    }

    public static void main(String[] args) {
        var obj = new Boy();

        //This will call the child class version of eat()
        obj.eat();
    }
}
