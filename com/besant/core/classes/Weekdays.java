package com.besant.core.classes;

public enum Weekdays {
    MONDAY(1,"1"),
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    private int number;
    private String val;
    public int getNumber(){
        return this.number;
    }
    Weekdays(int number,String val){
        this.number=number;
        this.val= val;
    }
    Weekdays(){

    }

    public static Weekdays[] WEEK= Weekdays.values();

    public static Weekdays getWeekdays(int dayNumber){
      return  WEEK[dayNumber-1];
    }
}

