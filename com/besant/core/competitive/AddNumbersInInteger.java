package com.besant.core.competitive;

public class AddNumbersInInteger {
    public static void main(String[] args) {
        int number= 343647; // 343
        int sum=0;
        while (number > 0){
            int remainder= number%10;
            number/=10; // 34  , 3,
            sum+=remainder; // 0 + 3 + 4 + 3
        }
        System.out.println(sum);
    }
}
