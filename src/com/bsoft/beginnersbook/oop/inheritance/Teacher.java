package com.bsoft.beginnersbook.oop.inheritance;

public class Teacher {

//    String designation = "Teacher";
//    String college = "BeginnersBook";
//
//
//    void does(){
//        System.out.println("Teaching");
//    }

 //   public static class PhysicsTeacher extends Teacher{
//        String mainSubject = "Physics";
//
//        public static void main(String[] args) {
//            PhysicsTeacher obj = new PhysicsTeacher();
//
//            System.out.println(obj.college);
//            System.out.println(obj.designation);
//            System.out.println(obj.mainSubject);
//
//            obj.does();
//
//        }
//    }

    //Using Private memebers

    private String designation = "Teacher";
    private String college = "BeginnersBook";

    public String getDesignation(){
        return designation;
    }

    protected void setDesignation(String designation){
        this.designation = designation;
    }

    protected String getCollege(){
        return college;
    }

    protected void setCollege(String college){
        this.college = college;
    }

    void does(){
        System.out.println("Teaching");
    }

    public static class JavaExample extends Teacher{

        String mainSubject = "Physics";
        public static void main(String[] args) {

            JavaExample obj = new JavaExample();

            /* Note: we are not accessing the data members
             * directly we are using public getter method
             * to access the private members of parent class
             */

            System.out.println(obj.getCollege());
            System.out.println(obj.getDesignation());
            System.out.println(obj.mainSubject);

            obj.does();

        }
    }



}
