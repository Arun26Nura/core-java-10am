package com.besant.core.competitive;

public class DaysInMonth {
    public static void main(String[] args) {
        int year=1900;
        int month= 72;
        // Jan, mar, may, jul, aug, oct, dec = 31
        // apr , jun, sep, nov =30
        // feb - 29 or 28

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                if(year%4==0){
                   if(year%100 ==0){
                       if(year%400==0){
                           System.out.println("29 days");
                       }else{
                           System.out.println("28 days");
                       }

                   }else{
                       System.out.println("29 days");
                   }

                }else{
                    System.out.println("28 days");
                }
                break;
            default:
                System.out.println("Invalid");
                break;

        }


    }

    // year /4 , year/100 and not by 400.
}
