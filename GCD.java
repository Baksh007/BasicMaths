package com.dsa.basicsmaths;

public class GCD {
    public static int checkGCD(int a, int b) {
        int gcd = 1;
        for(int i=1; i<=Math.min(a, b);i++) {
            if(a%i == 0 && b%i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 24;
        System.out.println(checkGCD(a,b));
    }
}
