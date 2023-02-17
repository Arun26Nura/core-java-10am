package com.besant.core.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    // Streams are pipelines that perform actions on collections.

    // Intermediate functions  - Streams of data
        // filter, map,flatmap, stream
    // Terminal Functions  - Will not return a stream of data.
        //anyMatch, allMatch,NoneMatch, findFirst, FindAny,Collectors.
    public static void main(String[] args) {
        List<Integer>  numberList = List.of(1,43,23,2,3,4,243,242);

        numberList.stream().filter(number -> number%2==0).forEach(number -> System.out.println(number));


        // filter
    }


}
