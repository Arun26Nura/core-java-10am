package com.besant.core.operators;

public class SwitchExpressions {
    public static void main(String[] args) {
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
        System.out.println(numberOfDays);
    }


}
