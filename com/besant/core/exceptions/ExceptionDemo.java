package com.besant.core.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {

    public static void main(String[] args)  {
        FileInputStream inputStream = null;
try {
    File file = new File("C:\\Users\\arunk\\OneDrive\\Desktop\\arun-documents\\answers.txt");
     inputStream= new FileInputStream(file);
    System.out.println("Hi");
}catch(FileNotFoundException e){

}catch(IOException e){

}catch(Exception e){

}finally {
    try {
        inputStream.close();
    }catch(Exception e){
        e.printStackTrace();
    }
}
        System.out.println("Hello");

    }
}
