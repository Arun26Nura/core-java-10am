package com.besant.core.classobjects;

public class MethodsDemo {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        addition(a,b);

        int e=10;
        int f=23;
        int h= e+f;

        int r=30;
        int s=23;

    }
    public static void addition(int a, int b){

        int c;
        c= a+b;
    }

    public void returnNothing(){
        System.out.println("Do Nothing");
    }
    public void printString(String input){
        System.out.println(input);
    }
    public float returnNumber(int input){
        return input;
    }

    // access-modifier static- optional return-type method-name ( Parameters){}
}
