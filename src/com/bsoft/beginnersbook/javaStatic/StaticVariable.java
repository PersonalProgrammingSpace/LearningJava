package com.bsoft.beginnersbook.javaStatic;

public class StaticVariable {
    //Example 1
//    static int var1;
//    static String var2;
//
//    //This is the static method
//    static void disp(){
//        System.out.println("Var1 is: " +var1);
//        System.out.println("Var2 is: " +var2);
//    }
//
//    public static void main(String[] args) {
//        disp();
//    }

    //Example 2.

    //static variable
    static int var1=77;
    //non-static variable
    String var2;

    public static void main(String[] args) {
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();

        /* static variables can be accessed directly without
         * any instances. Just to demonstrate that static variables
         * are shared, I am accessing them using objects so that
         * we can check that the changes made to static variables
         * by one object, reflects when we access them using other
         * objects
         */
        //Assigning the value to static variable using object ob1

        obj1.var1 = 88;
        obj2.var2 = "I'm Object1";

        /* This will overwrite the value of var1 because var1 has a single
         * copy shared among both the objects.
         */

        obj2.var1 = 99;
        obj1.var2 = "I'm Object2";

        System.out.println("obj1 integer: "+obj1.var1);
        System.out.println("obj1 integer: "+obj1.var2);
        System.out.println("obj1 integer: "+obj2.var1);
        System.out.println("obj1 integer: "+obj2.var2);

    }
}
