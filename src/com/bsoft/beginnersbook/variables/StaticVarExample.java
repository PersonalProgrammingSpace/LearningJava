package com.bsoft.beginnersbook.variables;

public class StaticVarExample {
    public static String myClassVar = "class or static variable";

    public static void main(String[] args) {
        StaticVarExample obj1 = new StaticVarExample();
        StaticVarExample obj2 = new StaticVarExample();
        StaticVarExample obj3 = new StaticVarExample();

        //All the three will display "class or static variable"
        System.out.println(obj1.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);

        // CHanging the value of static variable using obj2
        obj2.myClassVar = "Changed Text";

        System.out.println("============ Changed Text ============");
        // All the three will display "Changed Text"
        System.out.println(obj1.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);
    }
}
