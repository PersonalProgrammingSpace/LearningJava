package com.bsoft.beginnersbook.constructor;

public class Example3 {

//    private int var;
//    public Example3(int num)
//    {
//        var=num;
//    }
//    public int getValue()
//    {
//        return var;
//    }
//    public static void main(String args[])
//    {
//        Example3 myobj = new Example3();
//        System.out.println("value of var is: "+myobj.getValue());
//    }

    //Output:
    // It will throw a compilation error. The reason is, the statement Example3 myobj = new Example3() is
    // invoking a default constructor which we don’t have in our program. when you don’t implement any constructor
    // in your class, compiler inserts the default constructor into your code, however when you implement any constructor
    // (in above example I have implemented parameterized constructor with int parameter), then you don’t receive the
    // default constructor by compiler into your code.

    //If we remove the parameterized constructor from the above code then the program would run fine, because then
    // compiler would insert the default constructor into your code.

}
