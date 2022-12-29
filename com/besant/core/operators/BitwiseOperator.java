package com.besant.core.operators;

public class BitwiseOperator {
    public static void main(String[] args) {
        //complement operator
        int number=-6; //-(n+1)
        System.out.println(~number);
        // Bitwise AND
        System.out.println(6 & 5);
        // Bitwise OR
        System.out.println(6 | 5);
        // Bitwise XOR
        System.out.println(6 ^ 5);
        // Left Shift
        System.out.println(6 << 2);
        // Signed Right Shift
        System.out.println(-8 >> 2);//1
        // UnSigned Right Shift
        System.out.println(-8 >>> 2);//0
    }
}
