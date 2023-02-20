package com.besant.core.string;

import java.util.StringJoiner;

public class StringDemo2 {
    public static void main(String[] args) {
        String one= "Chennai";
        one = one.replace("a","s");
       String two="Chennai";
        System.out.println(one); // Chennai
        System.out.println(two); // Chennsi

        String name= "Hello";
        name= name.concat("Chennai");

        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append("Hello ");
        stringBuilder.append("test");
        stringBuilder.append("Character");

        String output= stringBuilder.toString();
        System.out.println(output);

        StringBuffer stringBuffer= new StringBuffer();
        stringBuffer.append("Hello ");
        stringBuffer.append("test");
        stringBuffer.append("Character");
        String output2= stringBuffer.toString();
        System.out.println(output2);
        // Chennai Bangalore Delhi
        StringJoiner stringJoiner= new StringJoiner(",");
        stringJoiner.add("Chennai");
        stringJoiner.add("Bangalore");
        System.out.println(stringJoiner.toString());


    }
}
