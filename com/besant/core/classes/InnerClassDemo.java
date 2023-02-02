package com.besant.core.classes;

class Courses{
    class Java{
        public void printJava(){
            System.out.println("Java");
        }
        class Spring{
            public void printSpring(){
                System.out.println("Java");
            }
        }
    }

   static class Python{
        public void printPython(){
            System.out.println("Python");
        }
       public static void printFramework(){
           System.out.println("Framework");
       }

   }
    public void printSomething(){
        System.out.println("Hello");
    }


}
public class InnerClassDemo {
    public static void main(String[] args) {
        Courses courses= new Courses();
        Courses.Java java = courses.new Java();
        Courses.Java.Spring spring= java.new Spring();
        java.printJava();

        Courses.Python python= new  Courses.Python();
        python.printPython();
    }
}
