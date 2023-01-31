package com.besant.core.polymorphism;

import com.besant.core.interfaces.Bajaj;

class Bike {


    public void show(){
        System.out.println("Bike");
    }


}
class Enfield extends Bike{

    @Override
    public void show(){

        System.out.println("Enfield");
    }
}

public class MethodOverridingDemo {

    public static void main(String[] args) {
        Bike enfield= new Enfield();
        enfield.show();
    }
}
