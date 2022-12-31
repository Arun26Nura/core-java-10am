package com.besant.core.demo;

public class RelationalOperators {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        // Equals  ==
        boolean equals= a==b;
        System.out.println("Equals: "+ equals);
        //Not Equals  !=
        boolean notEquals= a!=b;
        System.out.println("Not Equals: "+ notEquals);
        // Greater than  >
       boolean greater= a>b;
        // Less than   <
        boolean less= a<b;
        // Greater than or equals to  >=
        boolean greaterEquals= a>=b;

        // Less than or Equals to  <=
        boolean lessEquals= a<=b;
    }
}
