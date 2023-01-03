package com.besant.core.arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int[][] arrayName= new int[2][2];
        arrayName[0][0]=23;
        arrayName[0][1]=24;
        arrayName[1][0]=2;
        arrayName[1][1]=3;

       // String[][] strings= {{"Chennai","Bangalore"},{"Delhi", "Pune"}};

        for(int i=0; i< arrayName.length;i++){
            int[] val=arrayName[i];
            for(int j=0;j< val.length;j++){
              //  System.out.println(arrayName[i][j]);
                System.out.println(val[j]);
            }
        }

        for(int[] val: arrayName){
            for(int numbers: val){
                System.out.println(numbers);
            }

        }
    }
}
