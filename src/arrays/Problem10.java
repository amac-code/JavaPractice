/*
package com.dranshuman.aifsd.arrays;

*/
/*Problem 10: Write a Java program that finds and prints the intersection (common elements) of two arrays.
           Assume both arrays contain unique elements.

Input:
        Array 1: [3, 6, 9, 12, 15]
        Array 2: [6, 12, 18, 24]
Output:
        Intersection of Array 1 and Array 2: [6, 12]
*//*



import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.println("\nEnter Elements of 1st Array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("\nArray 1 is: " + Arrays.toString(arr1));


        int[] arr2 = new int[n];
        System.out.println("\nEnter Elements of 2nd Array:");
        for (int j = 0; j < n; j++) {
            System.out.print("Enter element " + (j + 1) + " : ");
            arr2[j] = sc.nextInt();
        }
        System.out.println("\nArray 2 is: " + Arrays.toString(arr2));


        int[] intersect = new int[n];
        for (int i = 0; i < n; i++) {
            if(arr1[i]==arr2[i]){
                intersect[i] = arr1[i];
            }
        } System.out.println("\nIntersection of Array 1 and Array 2 is: " + Arrays.toString(intersect));

    }
}
*/
