package com.arrays;

//Problem 9: Write a Java program that finds and prints the index of a specific element in an array of integers.
//           If the element is not found, print a message indicating that it's not in the array.
//Input:
//Array: [4, 8, 12, 16, 20, 24, 28]
//Element to Find index: 16
//
//Output (Element Found):
//Index of 16: 3
//or
//Output (Element not Found):
//Element "input" is not in the array.
//
//

import java.util.*;

public class Problem9 {
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

        System.out.print("\nEnter the element to find index: ");
        int element= sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(element==arr1[i]){
                System.out.println("Index of " + element + " is " + i);
            }
        } System.out.println("\nElement " + "\"" + element + "\"" + " is not in the array");

        sc.close();

    }
}
