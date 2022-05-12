package com.bsoft.controlFlow;

public class SwitchStatement {
    public static void main(String[] args) {
        /*
            SWITCH Statement executes one statement from multiple conditions.
            In Other words:
            SWITCH Statement tests the equality of a variable against multiple values.
         */

        String role = "admin";

//        if(role == "admin")
//            System.out.println("You are an admin");
//        else if ( role == "moderator")
//            System.out.println("You are a moderator");
//        else
//            System.out.println("You are a guest");

        // The SWITCH equavalent:
        switch ( role ){
            case "admin":
                System.out.println("You are an admin");
                break;
            case "moderator":
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("You are a guest");
        }



    }
}
