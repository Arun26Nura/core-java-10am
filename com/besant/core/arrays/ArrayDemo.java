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


        double[] doubles={1d,34d,34.34d,343.3d};

        Object[] objects= {"chennai",23,true,'c',32.34d};
        String stringVal= (String)objects[0];
        int numbers= (Integer) objects[1];  // int or Integer

        String[] cityList={"Chennai", "Bangalore", "Pune"};
        // For Loop
        for(int i=0;i<cityList.length;i++){
           // System.out.println(strings[i]);
        }

        //0->1 -> 2 -> 3
        // enhanced for loop for for-each loop
        for(String city:cityList){
            System.out.println(city);
        }

        // for-each method
        Arrays.stream(cityList)
                .forEach(city -> System.out.println(city));



    }
}
