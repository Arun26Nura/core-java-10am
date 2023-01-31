package com.besant.core.interfaces;

import java.util.function.*;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

       Predicate<String> predicateObject = new Predicate<>(){

           @Override
           public boolean test(String name){
               return true;
           }
       };
       predicateObject.test("string");

       Predicate<Integer> numberpredicate= number -> number%2==0;
        System.out.println(numberpredicate.test(4));

        Consumer<String> stringConsumer= s -> System.out.println(s);
        Bajaj<String,String> bajaj = model -> {
            String modelVersion= model;
            return modelVersion;
        };

        //BiPredicate
        //BiConsumer

        Supplier<String> stringSupplier= () -> {
            System.out.println("Hello");
            return "Chennai";
        };

        stringConsumer.accept("Chennai");
        String data= stringSupplier.get();

    }
}
