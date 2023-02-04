package com.besant.core.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionThrows {
    public static void main(String[] args) {


    }

    public static void test() throws  Exception{
        readFile();
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("C:\\Users\\arunk\\OneDrive\\Desktop\\arun-documents\\answers.txt");
        var inputStream= new FileInputStream(file);
    }
}
