package com.bsoft.beginnersbook.oopsConcepts.polymorphism.methedOverloading;

//Example3: Overloading – Sequence of data type of arguments
public class DisplayOverloading3 {

    public void disp(char c, int num){
        System.out.println("I'm the first defination of method disp");
    }

    public void disp(int num, char c){
        System.out.println("I'm the second defination of method disp");
    }

}

class Sample3{
    public static void main(String[] args) {
        var obj = new DisplayOverloading3();
        obj.disp('a', 24);
        obj.disp(39, 'b');
    }
}
