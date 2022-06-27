package com.bsoft.beginnersbook.oopsConcepts.polymorphism.methedOverloading;

public class DisplayOverLoading {

    public void disp(char c){
        System.out.println(c);
    }

    public void disp (char c, int num){
        System.out.println(c + " " +num);
    }
}

class ExampleOverloading{

    public static void main(String[] args) {

        DisplayOverLoading display = new DisplayOverLoading();
        display.disp('a');
        display.disp('b', 13);


    }
}
