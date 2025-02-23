package com.jsp.programming;

import java.util.Arrays;

public class SwapArray {

    public static void sort(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] > arr[j]) {
                    arr[i] = arr[j] - arr[i] + (arr[j] = arr[i]); // swap
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,4,1,3,2};
        System.out.println(Arrays.toString(arr));// print array without loop
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
