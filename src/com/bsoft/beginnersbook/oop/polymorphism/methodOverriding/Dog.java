package com.bsoft.beginnersbook.oop.polymorphism.methodOverriding;

public class Dog extends Animal {

    public void animalSound() {
        System.out.println("WOOF");
    }

    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.animalSound();

//        //Few more overriding examples
//        Aminal obj = new Animal();
//        obj.animalSound();
//        //This would call the Animal class method
//
//        Dog obj = new Dog();
//        obj.animalSound();
//        //This would call the Dog class method
//
//        Animal obj = new Dog();
//        obj.animalSound();
//        //This will call the Dog class method

    }
}
