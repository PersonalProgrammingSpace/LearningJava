package com.bsoft.codewithmosh.exceptions.nestedExceptios;


/*

Nested Try Catch Example
Here we have deep (two level) nesting which means we have a try-catch block inside a nested try block.
 To make you understand better I have given the names to each try block in comments like try-block2, try-block3 etc.

This is how the structure is: try-block3 is inside try-block2 and try-block2 is inside main try-block,
you can say that the main try-block is a grand parent of the try-block3. Refer the explanation which is
given at the end of this code

.*/

public class NestingDemo {
    public static void main(String[] args) {
        //main try-block
        try{
            //try - block 2
            try{
                //try - block 3
                try{
                    int arr[] = {1, 2, 3, 4};
                    /* I'm trying to display the value of
                     * an element which doesn't exist. The
                     * code should throw an exception
                     */

                    System.out.println(arr[10]);
                } catch (ArithmeticException e){
                    System.out.println("Arithmetic Exception");
                    System.out.println("handle in try-block3");
                }
            }
            catch(ArithmeticException e3){
                System.out.println("ArrayIndexOutOfBoundsException");
                System.out.println("handled in main try-block");
            }
        }
        catch (ArrayIndexOutOfBoundsException e4){
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println("handle in main try-block");
        }
        catch (Exception e5){
            System.out.println("Exception");
            System.out.println("handled in main try-block");
        }
    }
}

/*
Output:

ArrayIndexOutOfBoundsException handled in main try-block

As you can see that the ArrayIndexOutOfBoundsException occurred in the grand child try-block3. Since try-block3
is not handling this exception, the control then gets transferred to the parent try-block2 and looked for the catch
handlers in try-block2. Since the try-block2 is also not handling that exception, the control gets transferred to the
 main (grand parent) try-block where it found the appropriate catch block for exception. This is how the the nesting
 structure works.

 */