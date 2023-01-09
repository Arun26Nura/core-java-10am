//package com.besant.core.classobjects;
//
//public class MethodsExample {
//
//    public static void main(String[] args) {
//        String city="Chennai";
//        Methods.printTheValue(city);
//        Methods methods= new Methods();
//        methods.printSomething();
//       String returnedVal= methods.returnTheValue(city);
//       int a=10;
//       int b=23;
//       int sum= methods.addNumbers(b,a);
//       String firstName= "Rahul";
//       String lastName="kumar";
//
//       String fulName= methods.createName(lastName, firstName);
//       Car firstCar= new Car();
//       methods.createNames("hello",1,lastName,firstCar, new Bike());
//
//    }
//
//    // access-modifier static/non-static => optional returntype methodName(Arguments){
//    // }
//
//
//}
//
//class Methods{
//
//    public void printSomething(){
//
//        int a=9;
//        String test="Chennai";
//        System.out.println("Print Something");
//        returnTheValue("Hello");
//    }
//
//    public static void printTheValue(String value){
//        System.out.println(value);
//
//    }
//
//    public String returnTheValue(String value){
//
//        addNumbers(1,2);
//        System.out.println(value);
//        return "1";
//    }
//
//    public int addNumbers(int a, int b){
//        add();
//        return a+b;
//    }
//
//    public String createName(String firstName, String lastName){
//        return firstName +" "+ lastName;
//    }
//
//    public String createNames(String one, int a,String lastName, Car car, Bike bike){
//        return one +" "+ lastName;
//    }
//
//    public Bike add(){
//        Bike bajaj= new Bike(); // deferenced objects // Null Objects
//        bajaj= new Bike();
//        return bajaj;
//    }
//
//}
//
//class car{
//
//
//}
//
//class Bike{
//static  int numbers=6;
//
//}
