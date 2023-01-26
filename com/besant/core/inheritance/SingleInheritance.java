package com.besant.core.inheritance;

class Vehicles{
    int wheels=0;
    int engine =1;

    public void start(){
        System.out.println("starting");
    }
    public void drive(){
        System.out.println("driving");
    }
    public void stop(){
        System.out.println("stopped");
    }

}
class Bikes extends Vehicle{
    int wheels=2;
    public void showColor(){
        System.out.println("Black");
    }
}

class Yamaha extends Bikes{
    @Override
    public void showColor(){
        System.out.println("Blue");
    }

}


public class SingleInheritance {
    public static void main(String[] args) {
        Yamaha yamaha= new Yamaha();
        yamaha.stop();
        yamaha.showColor();
        //yamaha.engine=5;
        System.out.println(yamaha.wheels);

    }
}
