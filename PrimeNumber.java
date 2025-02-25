package com.dsa.basicsmaths;

import static java.lang.Math.sqrt;

public class PrimeNumber {
    public static boolean checkPrime(int n) {
        int count = 0;
        for(int i=1; i<=sqrt(n); i++) {
            if(n%i == 0) {
                count++;
                if((n/i) != i) {
                    count++;
                }
            }
        }
        if(count == 2) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(checkPrime(n));
    }
}
