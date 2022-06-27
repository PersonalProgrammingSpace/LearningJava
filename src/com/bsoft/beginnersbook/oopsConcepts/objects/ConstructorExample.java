package com.bsoft.beginnersbook.oopsConcepts.objects;

public class ConstructorExample {

    String name;
    int age;

    //default constructor
    ConstructorExample(){
        this.name = "Buhari";
        this.age = 37;
    }

    //parameterize constructor
    ConstructorExample(String n, int a){
        this.name = n;
        this.age = a;
    }

    public static void main(String[] args) {
        ConstructorExample cons1 = new ConstructorExample("Buhari", 37);
        ConstructorExample cons2 = new ConstructorExample("Nasir", 72);

        System.out.println(cons1.name+ " " + cons1.age);
        System.out.println(cons2.name+ " "+ cons2.age);
    }
}
