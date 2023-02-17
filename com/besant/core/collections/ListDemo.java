package com.besant.core.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ListDemo {

    public static void main(String[] args) {

        // List - ArrayList

        List<String> temp= new ArrayList<>();
        temp.add("Bangalore");
        temp.add("Cochin");

        List<String> cityArrayList= new ArrayList<>()   ;
        cityArrayList.add("Chennai");
        cityArrayList.addAll(temp);
        System.out.println(cityArrayList);
        cityArrayList.add(1, "Delhi");
        System.out.println(cityArrayList);
        cityArrayList.add("Chennai");
        System.out.println(cityArrayList);
        cityArrayList.removeAll(temp);
        System.out.println(cityArrayList);
        System.out.println( cityArrayList.contains("Chennai"));
        int last= cityArrayList.indexOf("Chennai");
        System.out.println(last);
      //  cityArrayList.


        // List -- Linkedlist

        List<String> cityList= new LinkedList<>()   ;
        cityList.add("Chennai");
        cityList.addAll(temp);
        System.out.println(cityList);
        cityList.add(1, "Delhi");
        System.out.println(cityList);
        cityList.add("Chennai");
        System.out.println(cityList);
        cityList.removeAll(temp);
        System.out.println(cityList);
        System.out.println( cityList.contains("Chennai"));
        int lastIndex= cityList.indexOf("Chennai");
        System.out.println(lastIndex);
    }
}
