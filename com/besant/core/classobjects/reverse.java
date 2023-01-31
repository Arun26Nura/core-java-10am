package com.besant.core.classobjects;

public class reverse {

    public static void main(String[] args) {
        int num= 67345354;

        while(num > 0){
            System.out.print(num%10);
            num/=10;
        }
    }


}
