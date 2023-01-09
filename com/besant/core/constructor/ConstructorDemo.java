package com.besant.core.constructor;

public class ConstructorDemo {
    public static void main(String[] args) {
       Bike bike = new Bike();
        Student student= new Student(1,"name1",true,97093);
        System.out.println(student.phone);
        Student student1= new Student();
        Student[] students= new Student[2];
        students[0]= student1;
        students[1]= student;
    }

}

class Bike{


}

class Student{
    int id;
    //int id;
    String name;
    boolean isHostel;
    long phone;
    String email;
    // Instance variable shadowing.
   public Student(int id, String name,boolean isHostel, long phone){
       System.out.println("All Argument constructor");
       this.id=id;
       this.name=name;
       this.isHostel=isHostel;
       this.phone=phone;

   }
    public Student(int id,boolean isHostel, long phone){
        System.out.println("All Argument constructor");
        this.id=id;
       // this.name=name;
        this.isHostel=isHostel;
        this.phone=phone;

    }
    public Student(boolean isHostel,int ids, long phone){
        System.out.println("All Argument constructor");
        this.id=id;
        // this.name=name;
        this.isHostel=isHostel;
        this.phone=phone;

    }
   public Student(){
       System.out.println("No Argument constructor");

   }
}
