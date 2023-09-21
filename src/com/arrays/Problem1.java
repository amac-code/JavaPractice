package com.arrays;

//Problem 1: Write a Java program that iterates over an array and prints elements of the array.


import java.util.*;

public class Problem1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Elements of the array: ");
        int n = sc.nextInt();
        int[] arr1= new int[n];

        for(int i=0; i<n;i++){
            System.out.print("Enter element " + (i+1) +  " : ");
            arr1[i]= sc.nextInt();

        }
        System.out.println("\n The elements of array are: " + Arrays.toString(arr1));

    }
}
