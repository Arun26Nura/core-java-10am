package com.besant.core.string;

public class StringDemo {

    public static void main(String[] args) {
        String chennai= "Chennai"; // String Literals
        String delhi = new String("Delhi");  // Objects

        String city= "Chennai";
        String location= new String("Delhi");

        System.out.println(chennai == city);
        System.out.println(delhi == location);
        System.out.println(delhi.equals(location));
        System.out.println(delhi.equalsIgnoreCase(location));
        // length.
        int length= chennai.length();
        System.out.println(length);
        System.out.println(chennai.charAt(2));
        //Substring
        String ch= chennai.substring(1,3);
        System.out.println(ch);
        String chs= chennai.substring(3);
        System.out.println(chs);

        // Index of.
        String name="hello world world world";
        System.out.println(name.indexOf("worlds"));
        System.out.println(name.lastIndexOf("world"));
        System.out.println(name.contains("world"));

        String test="     Bangalore city       ";
        System.out.println(test.trim());

        System.out.println(test.replace("city","village"));


    }
}
