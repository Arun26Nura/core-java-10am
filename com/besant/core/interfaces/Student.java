package com.besant.core.interfaces;

import java.util.function.Predicate;

public class Student implements Predicate<String> {
    @Override
    public boolean test(String o) {
        return false;
    }
}
