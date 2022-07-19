package com.bsoft.beginnersbook.exception.throwException;

public class ThrowsExample {
    int division(int a, int b) throws ArithmeticException{
        int t = a/b;
        return t;
    }

    public static void main(String[] args) {
        var obj = new ThrowsExample();
        try {
            System.out.println(obj.division(15, 0));
        }
        catch(ArithmeticException e){
            System.out.println("You should't divide number by zero.");
        }
    }
}
