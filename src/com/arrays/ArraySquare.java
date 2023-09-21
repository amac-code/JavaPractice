package com.arrays;

/*
*
* Given an integer array nums sorted in non-decreasing order,
* return an array of the squares of each number
*
* i/p: [-4,-1,0,3,10]
* o/p: [16,1,0,9,100]
*
* Arrays.toString(arr);
* */

import java.util.*;

public class ArraySquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr1[i]= sc.nextInt();
        }

        System.out.println("\nArray before square: " + Arrays.toString(arr1));

        int[] arr2 = new int[n];
        for (int i =0; i<n; i++){
            arr2[i] = arr1[i] * arr1[i];
        }
        System.out.println("\nArray after square: " + Arrays.toString(arr2));

        sc.close();
    }
}