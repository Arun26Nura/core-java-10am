package com.besant.core.demo;

public class DataTypes {
    String name="Arun";
    static char charVal='3';
    // Primitives // Non-Primitives

    // Primitives - Numeric, Floating Numbers, char, boolean

    // Numeric - Byte, short, int , long
    // Floating - float, double
    // 8 bits - 1 byte


    // Variables - Container to hold the data in the application.
    // Local, Instance, Static

    public static void main(String[] args) {
        // data type - Reference Name = Value
        int intVal=8;

        // Variable declaration
        long longVal;
        // Variable assignment
        longVal=89;
        intVal=67;
        // variable initialization
        int intVal2=87;
        boolean cond;
        if(true){
            cond =false;
            intVal2=89;
        }
        cond=true;

        byte byteVal=127; // 1 byte or 8 bits
        short shortVal= -32768; // 2 byte
        int intVal4=344; // 4 bytes
        long longVal4= 43434; // 8 bytes

        float floatVal= 44.3434344344444444444f;
        System.out.println(floatVal);
        double Val= 44.3434344344444444444d;
        System.out.println(Val);
        // static assignments, dynamic assignments.

        char type=78; // Either we can assign characters or the ASCII value of the characters.
        System.out.println(type);

        boolean resul= false; // true or false

        String city="hello";

    }

    // Local - Stack

}
