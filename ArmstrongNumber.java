package com.dsa.basicsmaths;

public class ArmstrongNumber {
    public static void armNumber(int n) {
        int copy = n;
        int sum = 0;
        while(n>0) {
            int rem = n%10;
            sum += (rem*rem*rem);
            n/=10;
        }
        if(copy == sum) {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not");
        }
    }
    public static void main(String[] args) {
        int n = 1;
        armNumber(n);
    }
}
