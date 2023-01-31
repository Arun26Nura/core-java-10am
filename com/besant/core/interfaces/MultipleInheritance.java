package com.besant.core.interfaces;

interface G{
    void print();
}
interface A extends G{
   void show();

   default void printName(){
       System.out.println("A");
   }
}

interface B extends  G{
    void show();
    default void printName(){
        System.out.println("A");
    }

}

class C implements A,B{

    @Override
    public void show() {
        System.out.println("Show Method");
    }

    @Override
    public void printName() {

    }

    @Override
    public void print() {

    }


}

public class MultipleInheritance {
    public static void main(String[] args) {
        C c= new C();
        c.show();
        c.printName();
    }
}
