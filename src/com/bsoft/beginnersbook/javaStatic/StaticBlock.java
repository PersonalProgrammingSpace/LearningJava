package com.bsoft.beginnersbook.javaStatic;

//Example 1:
//public class StaticBlock {
//    static int num;
//    static String mystr;
//
//    static{
//        num = 97;
//        mystr = "Static keyword in Java";
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Value of num: " +num);
//        System.out.println("Value of mystr: " +mystr);
//    }
//}

//Example of Multiple Static blocks
//Lets see how multiple static blocks work in Java. They execute in the given order which means
// the first static block executes before second static block. That’s the reason, values initialized by
// first block are overwritten by second block.

public class StaticBlock{
    static int num;
    static String mystr;

    //first static block
    static{
        System.out.println("Ststic Block 1");
        num = 68;
        mystr = "Block1";
    }

    //second static block
    static{
        System.out.println("Static Block 2");
        num = 98;
        mystr = "Block2";
    }

    public static void main(String[] args) {
        System.out.println("Value of num: " +num);
        System.out.println("Value of mystr: " +mystr);
    }

}

