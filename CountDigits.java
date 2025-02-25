package com.dsa.basicsmaths;

public class CountDigits {
    public static int count(int n) {
        int count = 0;
        while(n>0) {
            int rem = n%10;
            count++;
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 4783;
        int res = count(n);
        System.out.println(res);
    }
}
