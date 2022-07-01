package com.bsoft.beginnersbook.oopsConcepts.abstracT;

//Abstract Class
//An abstract class outlines the methods but not necessarily implements all the methods
//A class that is declared using “abstract” keyword is known as abstract class. It can have
// abstract methods(methods without body) as well as concrete methods (regular methods with body).
abstract class Animal {

    //Abstract Method
    //A method that is declared but not defined. Only method signature no body.
    public abstract void animalSound();
}

//Dog extend Animal class
public class Dog extends Animal{
    public void animalSound(){
        System.out.println("WOOF woof");
    };

    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.animalSound();
    }

    //Hence for such kind of scenarios we generally declare the class as
    // abstract and later concrete classes extend these classes and override
    // the methods accordingly and can have their own methods as well.
}