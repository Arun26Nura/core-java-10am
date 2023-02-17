package com.besant.core.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        // set - HashSet  , LinkedHashset  , TreeSet.
        // Duplicates Not allowed

        // Hashset - Insertion order is nor preseverd
        Set<Integer> numberList = new HashSet();
         numberList.add(1);
        numberList.add(10);
        numberList.add(10);
        numberList.add(12); numberList.add(16);
        numberList.add(null);
        System.out.println(numberList);



        // LinkedHashset - LinkedList + Hashset
        // Insertion order is preserved.
        Set<Integer> numberLinkedHashset = new LinkedHashSet<>();
        numberLinkedHashset.add(1);
        numberLinkedHashset.add(10);
        numberLinkedHashset.add(10);
        numberLinkedHashset.add(12); numberLinkedHashset.add(16);
        numberLinkedHashset.add(null);
        System.out.println(numberLinkedHashset);

        // Treeset - Elements will be sorted automatically based on ASCII
        // Null insertion is not possible
        Set<String> nameList= new TreeSet<>();
        nameList.add("Chennai");
        nameList.add("bangalore");
        nameList.add("Bihar");
        System.out.println(nameList);


    }
}
