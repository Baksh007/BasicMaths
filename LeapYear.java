package com.jsp.programming;

import java.sql.SQLOutput;

public class LeapYear {

    public static boolean checkLeapYear(int year) {
        if((year % 4 == 0) && (year % 400 == 0 || year % 100 != 0)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkLeapYear(2004));
    }
}
