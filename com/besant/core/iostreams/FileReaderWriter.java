package com.besant.core.iostreams;

import java.io.*;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        FileReader fileReader= new FileReader("C:\\Users\\arunk\\OneDrive\\Documents\\name.txt");
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        FileWriter fileWriter= new FileWriter("C:\\Users\\arunk\\OneDrive\\Documents\\names.txt");
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
       // bufferedWriter.write();

    }
}
