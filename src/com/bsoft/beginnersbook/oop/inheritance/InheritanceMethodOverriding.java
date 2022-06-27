package com.bsoft.beginnersbook.oop.inheritance;

/* Inheritance and Method Overriding

When we declare the same method in child class which is already present in the parent class the this is called m
ethod overriding. In this case when we call the method from child class object, the child class version of the
method is called. However we can call the parent class method using super keyword as I have shown in the example below:
*/

public class InheritanceMethodOverriding {
    //Parent constructor class
    InheritanceMethodOverriding(){
        System.out.println("Constructor of Parent");
    }

    void disp(){
        System.out.println("The Parent Method");
    }


   static class JavaExample extends InheritanceMethodOverriding{
        JavaExample(){
            System.out.println("Constructor of Child");
        }

        void disp(){
            System.out.println("Child Method");

            //Calling the disp() method of parent class
            super.disp();
        }

        public static void main(String[] args) {
            //Calling the disp() object of Child class
            JavaExample obj = new  JavaExample();
            obj.disp();
        }
    }
}
