package com.besant.core.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(1, "Chennai");
        stringMap.put(2, "Bangalore");


        Set<Integer> keys = stringMap.keySet();
        for (Integer key : keys) {
            stringMap.get(key);
        }

        var entries = stringMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries)
            System.out.println(entry.getKey() + "" + entry.getValue());

        stringMap.forEach((key , value) -> System.out.println(key+":"+ value));
    }

}
