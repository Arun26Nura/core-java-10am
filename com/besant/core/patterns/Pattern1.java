package com.besant.core.patterns;

public class Pattern1 {
    public static void main(String[] args) {

        // pattern -1
        int num=5;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("===============");
        System.out.println();

        // Pattern -2
        for(int i=1;i<=num;i++){
            for(int j=num;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("===============");
        System.out.println();
        // pattern -3

        for(int i=1;i<num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=num;i++){
            for(int j=num;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
