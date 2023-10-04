package com.arrays2;

/*
 *   Find Missing Number

 * Write a program that finds the missing number in an array of integers.
 * The array contains all integers from 1 to n except for one missing number.

 * */

import java.util.*;

public class FindMissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int result = findMissingNum(arr);
        System.out.println("Missing number is: " + result);
    }

    public static int findMissingNum(int[] arr) {
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                n++;
            }
        }
        return n;
    }
}


//element: [1, 2, 3, 5, 6]
//index:   [0, 1, 2, 3, 4]

/*
  ****   DRY RUN  *****

      1.  n = 1;
          i = 0;
          arr[0] = n (if true then n+1)
          n = 2;

      2.  n = 2;
          i = 1;
          arr[1] = n (if true then n+1)
          n = 3;
      3.  n = 3;
          i = 2;
          arr[2] = n (if true then n+1)
          n = 4;
      4.  n = 4;
          i = 1;
          arr[3] = n (not true)

          return n; (will go to line no. 36 )

          Function call:
          Missing number is: 4 (it will print value of n which in this case is "4" )
*/

