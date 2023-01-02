package com.besant.core.loop;

public class JumpStatements {
    public static void main(String[] args) {

        // Jump statement - Break. continue

        //loop from 1 to 10. first number divisible by 3

        for(int i=1;i<=10;i++){
            if(i%3==0){
                System.out.println(i);
                break;
            }
        }
        System.out.println("=======================");
        for(int i=1;i<=10;i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }


    }
}
