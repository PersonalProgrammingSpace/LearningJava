package com.bsoft.beginnersbook.oop.objects;

public class Website{
    //fields or instance variables
    String webName;
    int webAge;

    //constructor
    Website(String name, int age){
        this.webName = name;
        this.webAge = age;
    }

    public static void main(String[] args) {

        //creating objects
        Website web1 = new Website("bsoft", 1);
        Website web2 = new Website("google", 18);

        //accessing objects
        System.out.println(web1.webName + " " + web1.webAge);
        System.out.println(web2.webName + " "+ web2.webAge);
    }
}