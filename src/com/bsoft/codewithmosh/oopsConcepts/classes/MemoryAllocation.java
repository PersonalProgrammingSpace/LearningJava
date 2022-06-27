package com.bsoft.codewithmosh.oopsConcepts.classes;

public class MemoryAllocation {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        var textBox2 = new TextBox();

        textBox2.setText("Hello World");
        System.out.println(textBox1.text);
    }
}
