package com.bsoft.beginnersbook.oopsConcepts.superKeyword;

public class ParentExample {

    //no-arg constructor
    ParentExample(){
        System.out.println("no-args constructor of parent class");
    }

    //arg or parameterized constructor
    ParentExample(String str){
        System.out.println("parameterized constructor of parent class");
    }
}

class SubclassEx extends ParentExample{
    SubclassEx(){

        /* super() must be added to the first statement of constructor
         * otherwise you will get a compilation error. Another important
         * point to note is that when we explicitly use super in constructor
         * the compiler doesn't invoke the parent constructor automatically.
         */

        super("Hahaha");
        System.out.println("Constructor of child class");
    }

    void display(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        SubclassEx obj = new SubclassEx();
        obj.display();
    }
}
