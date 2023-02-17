package com.besant.core.collections;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamsDemo2 {

    public static void main(String[] args) {
        List<Students> studentsList= new ArrayList<>();
        studentsList.add(new Students(1, "Bala","M",35,false));
        studentsList.add(new Students(2, "Vijay","M",65,true));
        studentsList.add(new Students(3, "Deepa","F",45,false));
        studentsList.add(new Students(4, "Preethi","F",85,true));


        studentsList.stream() // Stream<Students> - 4
                .filter(students -> students.isPass()) //Stream<Students> -2 students
                .forEach(students -> System.out.println(students.getName()));

        studentsList.stream()
                .filter(students -> students.getMarks() < 50)
                .forEach(students -> {
                    System.out.println(students.getMarks());
                    System.out.println(students.getName());
                });









    }
}
