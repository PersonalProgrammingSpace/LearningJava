package com.bsoft.beginnersbook.oop.abstractClass;

//Abstract Class
//An abstract class outlines the methods but not necessarily implements all the methods
abstract class Animal {

    //Abstract Method
    //A method that is declared but not defined. Only method signature no body.
    public abstract void animalSound();
}

public class Dog extends Animal{
    public void animalSound(){
        System.out.println("WOOF woof");
    };

    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.animalSound();
    }
}