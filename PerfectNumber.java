package com.jsp.programming;

import java.util.Scanner;

public class PerfectNumber {
    public static void checkPerfect(int n) {
        int sum = 0;
        for(int i=1; i<=n/2;i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        if(sum == n) {
            System.out.println("Strong Number");
        }
        else {
            System.out.println("Not a Strong Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        checkPerfect(n);
    }
}
