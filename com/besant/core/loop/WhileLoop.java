package com.besant.core.loop;

public class WhileLoop {
    public static void main(String[] args) {
       // Boolean condition=true;
        int i=0;
        /**
         * while(condition=true){
         *
         * }
         */
        while (i <=10){
            i++;
           // System.out.println(i);
        }
        /**
         * do{
         *
         * }while(condition=true)
         */
        int j=5;
        do {
            System.out.println(j++);
        }while (j<5);
    }
}
