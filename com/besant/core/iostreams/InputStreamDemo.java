package com.besant.core.iostreams;

import java.io.*;

public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream= new FileInputStream("C:\\Users\\arunk\\OneDrive\\Documents\\name.txt");
        InputStreamReader inputStreamReader= new InputStreamReader(fileInputStream);
char[] chars= new char[5000];
FileOutputStream fileOutputStream= new FileOutputStream("C:\\Users\\arunk\\OneDrive\\Documents\\output-name.txt");
        OutputStreamWriter outputStreamWriter= new OutputStreamWriter(fileOutputStream);
/**
        int data= inputStreamReader.read();
       while (data !=-1){
           outputStreamWriter.write(data);
       }
 */
inputStreamReader.read(chars);
outputStreamWriter.write(chars);
    }
}
