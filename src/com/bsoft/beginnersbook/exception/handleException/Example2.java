package com.bsoft.beginnersbook.exception.handleException;

public class Example2 {
    public static void main(String[] args) {
        try{
            int a[] = new int[7];
            a[4] = 30/2;
        }
        catch (ArithmeticException e){
            System.out.println("Warning: ArirthmeticException");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Warning: ArrayOutOfBoundException");
        }
        catch (Exception e){
            System.out.println("Warning: some other exception");
        }
        System.out.println("Out of try-catch block...");
    }
}
