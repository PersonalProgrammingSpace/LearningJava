package com.bsoft.beginnersbook.oop.inheritance;

public class MathTeacher extends  Teacher{

    String mainSubject = "Maths";

    public static void main(String[] args) {

        MathTeacher teach = new MathTeacher();

        System.out.println(teach.designation);
        System.out.println(teach.college);
        System.out.println(teach.mainSubject);

        teach.does();
    }



}
