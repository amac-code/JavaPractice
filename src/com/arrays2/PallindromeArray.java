package com.arrays2;

/*
 * Check for Palindrome Array

 * Write a program that checks if an array of integers is a palindrome,
 * meaning it reads the same backward as forward. For example, [1, 2, 3, 2, 1] is a palindrome array.

 */

import java.util.*;

public class PallindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }


        if (PallindromeCheck(arr)){
            System.out.println("Array is a Pallindrome");
        }else{
            System.out.println("Array is not a Pallindrome");
        }
    }

    public static boolean PallindromeCheck(int[] arr) {
        System.out.println("Original array: " + Arrays.toString(arr));

        int[] reversed = new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            reversed[i] = arr[arr.length-1-i];
        }
        System.out.println("Reversed array: " + Arrays.toString(reversed));


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}


//Dry Run

/*
* [1, 2, 3, 4, 3, 2, 1]
* [0, 1, 2, 3, 4, 5, 6]
*
*
* n=7 (or array.length)
*
*
*
* */
