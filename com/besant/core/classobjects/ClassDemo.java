package com.besant.core.classobjects;

public class ClassDemo {
    public static void main(String[] args) {

        // 1, 2,4 = Numbers
       Car firstCar= new Car();
       Car secondCar= new Car();
        System.out.println(firstCar);
        System.out.println(secondCar);

   }
}

// class class-name{ }

class Car{
    int wheels;
    String engineModel;
    int gearPosition=0;

    public void changeGearPosition(int position){
        gearPosition=position;
    }
}

