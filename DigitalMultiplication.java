package com.jsp.programming;

public class DigitalMultiplication {

    public static int digitsMultiplication(int n) {
        int pro = 1;
        while(n != 0) {
            int rem = n % 10;
            if(rem != 0) {
                pro *= rem;
            }
            n /= 10;
        }
        return pro;
    }

    public static void main(String[] args) {
        System.out.println("Multiplication of all Digits: "+digitsMultiplication(707));
    }
}
