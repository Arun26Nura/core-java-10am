package com.besant.core.demo;

public class LogicalOperators {
    public static void main(String[] args) {
        // Logical AND , OR
        int a=0;
        int b=0;

        // AND &&
       boolean andVal= a!=0 &&  b!=0;
        System.out.println(andVal);

        // true true =true
        //true false= false
        // false true = false
        // false false = false
        // OR ||
        boolean orVal= a!=0 ||  b!=0;
        System.out.println(orVal);
        // true true =true
        //true false= true
        // false true = true
        // false false = false
    }
}
