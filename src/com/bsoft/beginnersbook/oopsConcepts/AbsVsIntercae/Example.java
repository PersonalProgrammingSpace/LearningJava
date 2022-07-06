package com.bsoft.beginnersbook.oopsConcepts.AbsVsIntercae;

public class Example {

    public void display1(){
        System.out.println("display1 method");
    }
}

abstract class Example2{
    public void display2(){
        System.out.println("displays2 method");
    }
}

abstract class Example3 extends Example{
    abstract void display3();
}

class Example4 extends Example3{
    public void display3(){
        System.out.println("display3 method");
    }
}

class Demo{
    public static void main(String[] args) {
        Example4 obj = new Example4();
        obj.display3();
    }
}