package com.jsp.programming;

public class HappyNumberFromMToN {
    public static void printHappyNumber(int num) {
        int temp = num;
        while(num != 1 && num != 4) {
            int sum = 0;
            while(num != 0) {
                int rem = num % 10;
                int pow = rem * rem;
                sum += pow;
                num /= 10;
            }
            num = sum;
        }
        if(num == 1) {
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        int m = 100;
        int n = 500;

        for(int i=m; i<=n; i++) {
            printHappyNumber(i);
        }
    }
}
