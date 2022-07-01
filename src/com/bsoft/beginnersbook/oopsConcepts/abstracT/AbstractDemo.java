package com.bsoft.beginnersbook.oopsConcepts.abstracT;

//Example to demonstrate that object creation of abstract class is not allowed
abstract class AbstractDemo {
    public void myMethod(){
        System.out.println("Hello");
    }

    abstract  public void anotherMethod();
}

class Demo extends AbstractDemo{
    public void anotherMethod(){
        System.out.println("Abstract method");
    }

    public static void main(String[] args) {

        //error you cannot create object of it
//        AbstractDemo obj = new AbstractDemo();
//        obj.anotherMethod();
    }
}
