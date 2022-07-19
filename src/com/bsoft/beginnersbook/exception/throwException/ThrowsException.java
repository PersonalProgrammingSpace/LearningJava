package com.bsoft.beginnersbook.exception.throwException;

import java.io.IOException;

public class ThrowsException {
    void myMethod(int num) throws IOException, ClassNotFoundException{
        if(num == 1)
            throw new IOException("IOException Occurred");
        else
            throw new ClassNotFoundException("ClassNotFoundException");
    }
}

class Example{
    public static void main(String[] args) {
        try{
            var obj = new ThrowsException();
            obj.myMethod(1);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
