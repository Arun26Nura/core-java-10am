package com.besant.core.patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int k=0;k<=rows-i;k++){
                System.out.print("* ");
            }
            for(int m=rows;m>i;m--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
