package com.bsoft.beginnersbook.oopsConcepts.interfaces.Example1;

public class Demons implements inf2 {
    /* Even though this class is only implementing the
     * interface Inf2, it has to implement all the methods
     * of Inf1 as well because the interface Inf2 extends Inf1
     */

    public void method1() {
        System.out.println("Method1");
    }

    public void method2() {
        System.out.println("Method2");
    }

    public static void main(String[] args) {
        inf2 obj = new Demons();
        Inf1 obj2 = new Demons();
        obj.method2();
        obj2.method1();

    }
}
