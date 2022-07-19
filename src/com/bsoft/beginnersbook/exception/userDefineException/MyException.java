package com.bsoft.beginnersbook.exception.userDefineException;

/* This is my Exception class, I have named it MyException
 * you can give any name, just remember that it should
 * extend Exception class
 */

public class MyException extends Exception{
    String str1;

    /* Constructor of custom exception class
     * here I am copying the message that we are passing while
     * throwing the exception to a string and then displaying
     * that string along with the message.
     */
    MyException(String str2){
        str1 = str2;
    }

    public String toString(){
        return ("MyException Occured: " +str1);
    }
}

class Example1{
    public static void main(String[] args) {
        try{
            System.out.println("Starting of try block");
            // I'm throwing the custom exception using throw
            throw new MyException("This is My error Message");
        }
        catch(MyException e){
            System.out.println("Catch Block");
            System.out.println(e);
        }
    }
}
