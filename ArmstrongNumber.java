package com.jsp.programming;

import java.util.Scanner;

public class ArmstrongNumber {
    public static int countNumber(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int findPower(int n, int count) {
        int prod = 1;
        for(int i=1; i<=count; i++) {
            prod *= n;
        }
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int temp = n;
        int count = countNumber(n);

        int sum = 0;
        while(n != 0) {
            int rem = n % 10;
            int prod = findPower(rem,count);
            sum += prod;
            n /= 10;
        }
        if(sum == temp) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not a Armstrong Number");
        }
    }
}
