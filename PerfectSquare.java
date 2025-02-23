package com.jsp.programming;

import java.util.Scanner;

public class PerfectSquare {

    public static void checkSquare(int n) {

        boolean flag = true;
        for(int i=1; i<=n; i++) {
            int sqr = i * i;
            if(sqr == n) {
                System.out.println("Perfect Square");
                flag = false;
                break;
            }
        }
        if(flag == true) {
            System.out.println("Not a Perfect Square");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number which you want to check: ");
        int n = sc.nextInt();
        checkSquare(n);
    }

}