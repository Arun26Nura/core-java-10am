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

        Consumer<String> stringConsumer= new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        Consumer<Integer> stringCons = (integer) ->  {
            switch (integer){

            }
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
