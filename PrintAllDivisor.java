package com.dsa.basicsmaths;

public class PrintAllDivisor {
    public static int printDivisor(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i*(n/i);
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printDivisor(n));
    }
}
