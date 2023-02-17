package com.besant.core.collections;

import java.util.*;

class Student{

   private int roll;
   private String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
public class ListDemo2 {
    public static void main(String[] args) {

        List<Student> students= new ArrayList<>();
        //Student student= ;
        students.add(new Student(1,"Name1"));
        students.add(new Student(2,"Name2"));
        System.out.println(students);






    }
}

