package com.besant.core.operators;

public class NumberOfDays {
    public static void main(String[] args) {
        String month="Jan";
        // Switch Fallthough pattern - unless a break statement is found, 
        // the code will execute
        int numberOfDays = 0;
        // Case stacking
        switch (month){
            case "Jan":
            case "Mar":
                numberOfDays=31;
                System.out.println("31 days");
                break;
            case "Feb":
                numberOfDays=28;
                System.out.println("28 days");
                break;
            case "Apr":
            case "Sep":
                numberOfDays=30;
                System.out.println("30 days");
                break;
            
        }
        System.out.println(numberOfDays);
    }
}
// Jan , Mar, May, Jul, Aug, Dec = 31
// Feb= 28
//Apr, Jun, Sep, Oct, Nov - 30