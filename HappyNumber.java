package com.jsp.programming;

public class HappyNumber {

    public static void checkHappy(int n) {
        while(n != 1 && n != 4) {
            int sum = 0;
            while(n != 0) {
                int last = n % 10;
                int pow = last * last;
                sum += pow;
                n /= 10;
            }
            n = sum;
        }
        if(n == 1) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        checkHappy(16);
    }
}
