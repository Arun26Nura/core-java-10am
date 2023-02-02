package com.besant.core.classes;

public class EnumDemo {
    public static void main(String[] args) {

        int number= Weekdays.MONDAY.getNumber();
        System.out.println(number);
        System.out.println(Weekdays.getWeekdays(1));
    }
}
