package com.jsp.programming;
import java.util.Scanner;

public class Bircks {

    public static boolean checkCondition(int space, int goal) {
        if(space == goal) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int small = sc.nextInt();
        int big = sc.nextInt();

        int smallUnit = small * 1;
        int bigUnit = big * 5;

        int goal = sc.nextInt();

        int spaceOccupied = smallUnit + bigUnit;

        checkCondition(spaceOccupied, goal);
    }
}
