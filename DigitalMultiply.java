package com.jsp.programming;

public class DigitalMultiply {

    public static int digitalMult(int n) {
        int pro = 1;
        while(n != 0) {
            int rem = n % 10;
            pro *= rem;
            n = n/10;
        }
        return pro;
    }

    public static void main(String[] args) {
        System.out.println("Multiplication of the given number: "+digitalMult(4728));
    }
}
