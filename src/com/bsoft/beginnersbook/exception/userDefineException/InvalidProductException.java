package com.bsoft.beginnersbook.exception.userDefineException;

public class InvalidProductException  extends  Exception{

    //calling constructor of the parent method
    public InvalidProductException(String s){
        super(s);
    }
}

class Exam1{
    void productCheck(int weight) throws InvalidProductException{
        if(weight < 100){
            throw new InvalidProductException("Product Invalid");
        }
    }

    public static void main(String[] args) {
        var obj = new Exam1();
        try{
            obj.productCheck(60);
        }
        catch(InvalidProductException e){
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());
        }
    }
}
