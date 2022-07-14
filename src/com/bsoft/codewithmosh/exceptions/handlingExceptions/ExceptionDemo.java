package com.bsoft.codewithmosh.exceptions.handlingExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

//To handle exception
public class ExceptionDemo {
    public static void show(){
        try {
            var reader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");

            //getting message from the FileNotFoundException class
            System.out.println(e.getMessage());
        }

        System.out.println("File opened");
    }

//    public static void sayHello(String name){
//        System.out.println(name.toUpperCase());
//    }
}
