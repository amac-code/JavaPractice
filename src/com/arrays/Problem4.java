package com.arrays;

//Problem 4: Write a Java program that finds and prints the maximum element in an array of integers.

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("\nElements of Arrays are: " + Arrays.toString(arr1));

        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr1[i]>maxValue){
                maxValue = arr1[i];
            }
        }
        System.out.println("\nMaximum value of this array is: " + maxValue);

    }
}
