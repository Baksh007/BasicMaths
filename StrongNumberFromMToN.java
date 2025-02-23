package com.jsp.programming;

public class StrongNumberFromMToN {

    public static int factorial(int n) {
        int fact = 1;
        for(int i=n; i>=1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static void checkStrongNumber(int n) {
        int sum = 0;
        int temp = n;
        while(n != 0) {
            int rem = n % 10;
            int fact = factorial(rem);
            sum += fact;
            n /= 10;
        }
        if(sum == temp) {
            System.out.println(temp);
        }

    }

    public static void main(String[] args) {
        int m = 100;
        int n = 20000;

        for(int i=m; i<=n; i++) {
            checkStrongNumber(i);
        }
    }
}
