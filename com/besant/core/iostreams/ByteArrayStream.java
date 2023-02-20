package com.besant.core.iostreams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStream {
    public static void main(String[] args) {
        String data= "Hello";
        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(data.getBytes());
        byteArrayInputStream.readAllBytes();

        ByteArrayOutputStream byteArrayOutputStream= new ByteArrayOutputStream(5000);
        byteArrayOutputStream.writeBytes(data.getBytes());
    }
}
