package com.besant.core.competitive;

public class EvenNumbers {
    // 5 even numbers.

    public static void main(String[] args) {
        int resultIndex=0;
        int number= 1;
        while(resultIndex < 5){
            if(number%2==0){
                System.out.println("Even number : "+ number);
                resultIndex++;
            }
            number++;
        }

        for(int i=1;i<=10;i++){
            if(i%2==0){
               // System.out.println(i);
            }
        }
    }


}
