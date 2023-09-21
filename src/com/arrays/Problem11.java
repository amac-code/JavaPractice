package com.arrays;

//Problem 11: Write a Java program to find and print the largest and smallest elements in an array of integers.

import java.util.*;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr1= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("\nElements of Array are: " + Arrays.toString(arr1));

        int maxValue= Integer.MIN_VALUE;
        for (int i = 0; i <n; i++) {
            if (arr1[i]>maxValue){
                maxValue = arr1[i];
            }
        }
        System.out.println("\nLargest element in the array is: " + maxValue);

        int minValue= Integer.MAX_VALUE;
        for (int i = 0; i <n; i++) {
            if (arr1[i]<minValue){
                minValue = arr1[i];
            }
        }
        System.out.println("Smallest element in the array is: " + minValue);
    }
}
