package com.jsp.programming;

public class PrintFirstNPrimeNumber {

    public static boolean checkPrime(int n) {
        int count = 0;
        for(int i=2; i<n; i++) {
            if(n % i == 0) {
                count++;
                break;
            }
        }

        if(count == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int countPrime = 0;
        for(int i=2; countPrime<10 ; i++) {
            if(checkPrime(i)) {
                System.out.println(i);
                countPrime++;
            }
        }
    }
}
