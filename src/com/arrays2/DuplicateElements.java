package com.arrays2;

/*
* Check for Duplicate Elements
*
* Write a program that checks if there are any duplicate elements in an array of integers.
* Print "Duplicates found" if duplicates exist; otherwise, print "No duplicates.”
*
*/

import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            System.out.print("Element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        if (checkDuplicate(arr)){
            System.out.println("Duplicate found");
        }else{
            System.out.println("No duplicates found");
        }
    }

    public static boolean checkDuplicate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

}

//Dry Run
/*
        index = [0, 1, 2, 3, 4]
        arr   = [2, 4, 1, 6, 4]

        * 0 ==>1
        * 0 ==>2
        * 0 ==>3
        * 0 ==>4


        i = 0, arr[i] = 2
        j = 1, arr[j] = 4 → No match
        j = 2, arr[j] = 1 → No match
        j = 3, arr[j] = 6 → No match
        j = 4, arr[j] = 4 → No match


        i = 1, arr[i] = 4
        j = 2, arr[j] = 1 → No match
        j = 3, arr[j] = 6 → No match
        j = 4, arr[j] = 4 → Match found, return true
*/
