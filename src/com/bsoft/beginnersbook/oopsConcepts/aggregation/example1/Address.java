package com.bsoft.beginnersbook.oopsConcepts.aggregation.example1;

/*

For example consider two classes Student class and Address class. Every student has an address so the relationship between
student and address is a Has-A relationship. But if you consider its vice versa then it would not make any sense as an
Address doesn’t need to have a Student necessarily. Lets write this example in a java program.
Student Has-A Address

*/
public class Address {
    int streetNum;
    String city;
    String state;
    String country;

    Address( int streetNum, String c, String st, String cty){
        this.streetNum = streetNum;
        this.city = c;
        this.state = st;
        this.country = cty;
    }

}
