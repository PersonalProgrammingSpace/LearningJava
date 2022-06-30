package com.bsoft.beginnersbook.oopsConcepts.polymorphism.methodOverriding;

public class DynamicMethodDispatch {
    //Overriden method
    public void disp(){
        System.out.println("disp() method of Parent class");
    }
}

class Demo extends DynamicMethodDispatch{
    //Overriding method
    public void disp(){
        System.out.println("disp() method of CHild class");
    }

    public void newMethd(){
        System.out.println("new method of child class");
    }


    public static void main(String[] args) {

        /* When Parent class reference refers to the parent class object
         * then in this case overridden method (the method of parent class)
         *  is called.
         */

        var obj = new DynamicMethodDispatch();
        obj.disp();

        /* When parent class reference refers to the child class object
         * then the overriding method (method of child class) is called.
         * This is called dynamic method dispatch and runtime polymorphism
         */

        var obj2 = new Demo();
        obj2.disp();
        obj2.newMethd();
    }

}
