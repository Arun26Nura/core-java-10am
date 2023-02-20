package com.besant.core.iostreams;

import java.io.*;

public class ObjectStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream= new FileOutputStream("C:\\Users\\arunk\\OneDrive\\Documents\\object-name.txt");
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeLong(0l);
        objectOutputStream.writeChars("Hello");
        objectOutputStream.close();

        FileInputStream fileinputStream= new FileInputStream("C:\\Users\\arunk\\OneDrive\\Documents\\object-name.txt");
        ObjectInputStream objectInputStream= new ObjectInputStream(fileinputStream);
        System.out.println(objectInputStream.readLong());
        System.out.println(objectInputStream.readLine());

        objectInputStream.close();
    }
}
