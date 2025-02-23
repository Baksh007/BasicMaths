package com.jsp.programming;

public class CountNumberOfDigits {

    public static int countDigits(int n) {
        int count = 0;
        while(n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("The count of the Digits: "+countDigits(4783));
    }
}
