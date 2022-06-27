package com.bsoft.beginnersbook.oopsConcepts.aggregation.example12;

public class College {
    String collegeName;
    //Creating HAS-A relationship with Address class
    Address collegeAddr;
    College(String name, Address addr){
        this.collegeName = name;
        this.collegeAddr = addr;
    }
   //...

     /*

    As you can see that we didn’t write the Address code in any of the three classes, we simply created the HAS-A relationship
    with the Address class to use the Address code. The dot dot(…) part in the above code can be replaced with the public s
    tatic void main method, the code in it would be similar to what we have seen in the first example.

    */

}
