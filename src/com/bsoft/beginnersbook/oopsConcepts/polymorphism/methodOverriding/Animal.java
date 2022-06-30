package com.bsoft.beginnersbook.oopsConcepts.polymorphism.methodOverriding;

public class Animal {

    public void animalSound(){
        System.out.println("Animal is making a sound");
    }

}

class Horse extends Animal{
    @Override
    public void animalSound(){
        System.out.println("Neigh");
    }

    public static void main(String[] args) {
        Animal obj = new Horse();
        obj.animalSound();
    }
}

class Cat extends Animal{
    @Override
    public void animalSound() {
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Animal obj = new Cat();
        obj.animalSound();
    }


}
