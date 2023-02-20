package com.besant.core.iostreams;

import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriter {
    public static void main(String[] args) {
        StringReader stringReader= new StringReader("Hello");
       StringWriter stringWriter= new StringWriter();
       stringWriter.write("hello");
       stringWriter.write("test");
       String data= stringWriter.toString();
    }
}
