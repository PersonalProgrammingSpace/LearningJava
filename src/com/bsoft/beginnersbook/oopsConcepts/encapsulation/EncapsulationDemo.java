package com.bsoft.beginnersbook.oopsConcepts.encapsulation;

public class EncapsulationDemo {
    private int ssn;
    private String empName;
    private int empAge;

    public int getEmpSSN(){
        return ssn;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmSSN(int newValue){
        ssn = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }


    public void setEmpAge(int newValue){
        empAge = newValue;
    }
}

class EncapsTest{
    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setEmpName("Mario");
        obj.setEmpAge(20);
        obj.setEmSSN(111234);

        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee Age: " + obj.getEmpAge());
        System.out.println("Employee SSN: " + obj.getEmpSSN());
    }
}
