package com.besant.core.encapsulation;

class Student {
    int roll;
   private String name;
    String phone;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
       return this.name;
    }
}

public class EncapsulationDemo{

    public static void main(String[] args) {
        Student student= new Student();
        student.setName("Name");
        String studentName= student.getName();
    }

}

