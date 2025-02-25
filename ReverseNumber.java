package com.dsa.basicsmaths;

public class ReverseNumber {
    public static int reverse(int n) {
        int sign = Integer.signum(n);
        n = Math.abs(n);
        int rev = 0;

        while(n>0) {
            int rem = n%10;
            rem = (rem*10)+rem;
            n/=10;
        }
        return rev*sign;
    }
    public static void main(String[] args) {
        int n = 1534236469;
        int rev = reverse(n);
        System.out.println(rev);
    }
}
