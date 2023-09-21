package com.arrays;

//Problem 2: Write a Java program that copies elements of an array into another array.


import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            arr1[i]= sc.nextInt();
        }
        System.out.println("\nArray 1 is: " + Arrays.toString(arr1));

        int[] arr2 = new int[n];
        for (int i=0; i<n; i++){
            arr2[i] = arr1[i];
        }
        System.out.println("\nArray 2 (After copying elements from Array 1): " + Arrays.toString(arr2));
    }
}
