package com.besant.core.operators;

public class SwitchExpressions {
    public static void main(String[] args) {

        //  -> {
        //  sysout("Hello");
        // return "Hello";
        // }
        // -> "Hello";  ->{return "Hello"}
        // -> 10 > 0;  -> { boolean result= 10 > 0; return result;}
        // -> test("Hello");  ->{String result=test("Hello"); return result;}
        String month="Jan";
        int numberOfDays= switch (month){
            case "Jan","Mar","May","Aug" -> {
                System.out.println("Case 1");
                yield 31;
            }
            case "Feb" -> 28;
            case "Apr","Jun" -> 30;
           default -> 2;

        };

        switch (month){
            case "Jan","Mar","May","Aug" -> {
                System.out.println("Case 1");

            }
            case "Feb" -> {

            }
            case "Apr","Jun" -> {

            }

        };
        System.out.println(numberOfDays);
    }


}
