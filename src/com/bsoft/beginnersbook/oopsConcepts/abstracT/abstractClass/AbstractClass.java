package com.bsoft.beginnersbook.oopsConcepts.abstracT.abstractClass;

abstract class AbstractClass {
    public void disp(){
        System.out.println("Concrete method of parent class");
    }

    abstract public void disp2();
}

class Demos extends AbstractClass {

    public void disp2() {
        System.out.println("overriding abstract method");
    }

    public static void main(String[] args) {
        Demos obj = new Demos();
        obj.disp2();
    }
}


