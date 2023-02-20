package com.besant.core.iostreams;

import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream= new FileInputStream("C:\\Users\\arunk\\OneDrive\\Documents\\name.txt");
        BufferedInputStream bufferedInputStream= new BufferedInputStream(fileInputStream);

        FileOutputStream fileOutputStream= new FileOutputStream("C:\\Users\\arunk\\OneDrive\\Documents\\buffer-name.txt");
        BufferedOutputStream bufferedOutputStream= new BufferedOutputStream(fileOutputStream);

        byte[]  bytes= bufferedInputStream.readAllBytes();
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.close();
        bufferedInputStream.close();


    }
}
