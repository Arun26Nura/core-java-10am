package com.besant.core.iostreams;

import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {

        try {
            File file= new File("C:\\Users\\arunk\\OneDrive\\Documents\\name.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream= new FileOutputStream("C:\\Users\\arunk\\OneDrive\\Documents\\out-name.txt");


            int i= fileInputStream.read();
            while (i !=-1){
                fileOutputStream.write(i);
                System.out.println((char) i);
                i= fileInputStream.read();
            }

            fileInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
