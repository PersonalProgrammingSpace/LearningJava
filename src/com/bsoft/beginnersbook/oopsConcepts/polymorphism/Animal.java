package com.bsoft.beginnersbook.oopsConcepts.polymorphism;

/*
Polymorphism is a object oriented programming feature that allows us to perform a single action in different ways.
For example, lets say we have a class Animal that has a method animalSound(), here we cannot give implementation to
this method as we do not know which Animal class would extend Animal class. So, we make this method abstract like this:

 */
public abstract class Animal {

    public abstract void animalSound();

    //Now suppose we have two Animal classes Dog and Lion that extends Animal class.
    // We can provide the implementation detail there.
    public class Lion extends Animal{

        @Override
        public void animalSound(){
            System.out.println("ROAR");
        };
    }

    public class Dog extends Animal{

        @Override
        public void animalSound(){
            System.out.println("WOOF");
        }

    }
}

