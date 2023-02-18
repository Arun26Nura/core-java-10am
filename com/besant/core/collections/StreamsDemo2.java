package com.besant.core.collections;


import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsDemo2 {

    public static void main(String[] args) {
        List<Students> studentsList= new ArrayList<>();
        studentsList.add(new Students(1, "Bala","M",35,false));

        studentsList.add(new Students(14, "Bala","M",35,false));
    studentsList.add(new Students(142, "Bala","M",35,false));
        studentsList.add(new Students(3, "Bala","M",35,false));
        studentsList.add(new Students(2, "Vijay","M",65,true));
        studentsList.add(new Students(3, "Deepa","F",45,false));
        studentsList.add(new Students(4, "Preethi","F",84,true));


        studentsList.stream() // Stream<Students> - 4
                .filter(students -> students.isPass() && students.getMarks()>80) //Stream<Students> -2 students
                .forEach(students -> System.out.println(students.getName())); //

        studentsList.stream()
                .filter(students -> students.getMarks() < 50)
                .forEach(students -> {
                    System.out.println(students.getMarks());
                    System.out.println(students.getName());
                });
        // Check atleast one student gets more than 85 marks.
        // AnyMatch
      Boolean anyMatch=  studentsList.stream().anyMatch(students -> students.getMarks() >=85);
        System.out.println(anyMatch);
        // All Match

       studentsList.stream().filter(students -> students.getGender().equals("F"))
               .allMatch(students ->  students.getMarks() >=50);


        // NoneMatch
        Boolean NoneMatch=  studentsList.stream().noneMatch(students -> students.getMarks() <35);
        System.out.println(NoneMatch);

        // Find First

      var student=   studentsList.stream()
              .filter(students ->  students.getGender().equals("M"))
              .findFirst().orElse(null);

      var studentName= studentsList.parallelStream().filter(students -> students.getGender().equals("M"))
              .findAny().get();
        System.out.println(studentName);


// Sorting
       Set<Students> studentObjectLiost=  studentsList.parallelStream().filter(students -> students.getGender().equals("M"))
                .sorted(Comparator.comparing(Students::getGender)).collect(Collectors.toSet());

        Function<Students,String> function= s -> {
        String name= s.getName();
        return name;
        };
   var nameList=  studentsList.stream().filter(students ->  students.getGender().equals("M"))  // Stream<Students>
            .map(function).collect(Collectors.toList()) ;// Stream<String>

        // FlatMap

        var numbers= List.of(List.of(1,2,3), List.of(5,23,23), List.of(43,53,24));
      var sd=  numbers.stream().flatMap(number -> number.stream()).filter(num -> num %2==0).collect(Collectors.toList());


     studentsList.stream().min(Comparator.comparing(students -> students.getMarks()));

     studentsList.stream().filter(students ->  students.getGender().equals("F")).limit(2).collect(Collectors.toList());




        // Stream<List<Integer>>


























    }
}
