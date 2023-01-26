package com.besant.core.interfaces;

interface G{
    void print();
}
interface A extends G{
   void show();
}

interface B extends  G{
    void show();
}

class C implements A,B{

    @Override
    public void show() {
        System.out.println("Show Method");
    }

    @Override
    public void print() {

    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        B c= new C();
        c.show();
    }
}
