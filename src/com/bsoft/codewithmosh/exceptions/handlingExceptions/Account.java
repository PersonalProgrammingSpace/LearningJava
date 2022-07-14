package com.bsoft.codewithmosh.exceptions.handlingExceptions;

public class Account {
    public void deposit(float value){
        if(value <= 0)
            throw new IllegalArgumentException();
    }
}

class Demo{
    public static void show(){
        var account = new Account();
        account.deposit(-1);
    }

    public static void main(String[] args) {
        Demo.show();
    }
}
