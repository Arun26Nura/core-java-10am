package com.besant.core.control;

import java.util.List;
import java.util.Scanner;

public class DecisionStatement {
    public static void main(String[] args) {
        // Numbers from one to 30
        // range will be from 1 to 5 on the interval of 10
        int inputNumber=27;
        if(inputNumber >0 && inputNumber <=10){
            System.out.println("Range One");
        }
        else if(inputNumber >10 && inputNumber <=20){
            System.out.println("Range two");
        }else if(inputNumber >20 && inputNumber <=30){
            System.out.println("Range Three");
        }else{
            System.out.println("Not in Range");
        }

        //List<String> accesList=List.of("professor","hod","principal");
        Scanner scanner= new Scanner(System.in);
        String role1=scanner.next();
        String role2=scanner.next();
        String role3=scanner.next();


        // Associate - professor
        // Supervisor - professor, hod
        // Manager - professor, hod, principal.

        // Arun - professor,hod.

        if(role1.equals("professor") && role2.equals("hod") && role3.equals("principal")){
            System.out.println("Manager");
        }else if(role1.equals("professor") && role2.equals("hod")){
            System.out.println("Supervisor");
        }else if(role1.equals("professor")){
            System.out.println("Associate");
        }









        // If statement
        /**
        if(condition = true){

         }

        */
        int numberOne=10;
        int numberTwo=20;
        boolean statement= numberOne > numberTwo;

        if(statement){
            System.out.println("Number One is Greater");
        }
        if(numberTwo > numberOne){
            System.out.println("Number Two is Greater");
        }

        if(false){
            System.out.println("True");
        }




    }

    public static void add(String one){

    }
}
