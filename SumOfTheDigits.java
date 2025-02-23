package com.jsp.programming;

public class SumOfTheDigits {

    public static int sumOfDigits(int n) {
        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of the Digits: "+sumOfDigits(7372));
    }
}
