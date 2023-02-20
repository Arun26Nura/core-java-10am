package com.besant.core.multithreading;

class Hi implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("hi");
        }
    }
}

class Hello extends  Thread{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Hello");
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        Runnable hi=new Runnable() {
            @Override
            public void run() {
                Demo();
            }
        };
        Thread hello = new Thread(hi);


        hello.start();
    }

    private static void Demo() {
    }
}
