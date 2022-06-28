package com.bsoft.beginnersbook.oopsConcepts.association;

public class Driver extends CarClass {
    String driverName;
    Driver(String name, String ename, int cid){
        super(ename, cid);
        this.driverName = name;
    }
}
