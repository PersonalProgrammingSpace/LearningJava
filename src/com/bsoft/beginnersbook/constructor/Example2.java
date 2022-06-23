package com.bsoft.beginnersbook.constructor;


//Example2: parameterized constructor
//In this example, we have two constructors, a default constructor and a parameterized constructor.
// When we do not pass any parameter while creating the object using new keyword then default constructor is invoked,
// however when you pass a parameter then parameterized constructor that matches with the passed parameters list gets invoked.

public class Example2 {

    private int var;

    //Default Constructor

    Example2(){
        this.var = 10;
    }

    //parameterized constructor
    public  Example2(int num){
        this.var = num;
    }

    public int getValue(){
        return var;
    }

    public static void main(String[] args) {
        Example2 obj1 = new Example2();
        Example2 obj2 = new Example2(100);

        System.out.println("Var is: " + obj1.getValue());
        System.out.println("Var is: " + obj2.getValue());
    }

}
