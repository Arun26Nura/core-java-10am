package com.besant.core.access;

import java.time.DayOfWeek;

public enum Weekdays {
    MONDAY,
    TUESDAY;
    private static final Weekdays[] ENUMS = Weekdays.values();

    public static Weekdays of(int numer){
        Weekdays[] Weekdays;
        return ENUMS[numer-1];
    }


}
