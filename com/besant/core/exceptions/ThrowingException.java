package com.besant.core.exceptions;

public class ThrowingException {
    public static void main(String[] args) {
        try {
            number(-1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void number(int number)throws  CoreJavaException{


        if(number < 0)
            throw new IllegalArgumentException("Number less than Zero");

        if(number == 0)
            throw new CoreJavaException("Number is Zero");
        System.out.println(number);
    }
}
