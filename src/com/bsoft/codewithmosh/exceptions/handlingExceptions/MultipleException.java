package com.bsoft.codewithmosh.exceptions.handlingExceptions;

import java.io.FileReader;
import java.io.IOException;

public class MultipleException {
    public static void show(){
        FileReader reader = null;
        try {
            var fReader = new FileReader("file.txt");
            var value= reader.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        MultipleException.show();
    }
}
