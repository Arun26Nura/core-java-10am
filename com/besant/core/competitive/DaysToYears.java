package com.besant.core.competitive;

public class DaysToYears {
    public static void main(String[] args) {
        int inputNumber= 123456;  // 1 2 3 4 5 6
        // 654321
        // 1 2 3 4 5 6
        int reversedNumber=0;
        int number=inputNumber;
        while (number > 0){
          int remainder=  number%10;
          reversedNumber= reversedNumber*10+remainder;
            number=number/10;
        }
        System.out.println(reversedNumber);
        System.out.println(inputNumber == reversedNumber);

        while (reversedNumber > 0){
            System.out.println(reversedNumber%10);
            reversedNumber/=10;
        }
    }
}
