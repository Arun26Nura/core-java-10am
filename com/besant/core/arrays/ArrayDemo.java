package com.besant.core.arrays;

import java.util.Arrays;
import java.util.Objects;

public class ArrayDemo {
    public static void main(String[] args) {
        int val=10;
        int[] intArray = new int[5];  // n=10 - 0 to n-1
        intArray[0]=43;
        intArray[1]=34;
        intArray[2]=23;
        intArray[3]= 332;
        intArray[4]= 34;
      //  intArray[5]=22;

        int value=intArray[3];

        String[] strings={"Chennai", "Bangalore", "Pune"};
        double[] doubles={1d,34d,34.34d,343.3d};

        Object[] objects= {"chennai",23,true,'c',32.34d};
        String stringVal= objects[0];





    }
}
