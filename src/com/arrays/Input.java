package com.arrays;
import java.util.*;

/*public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i =0; i <n; i++) {
            System.out.println("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of array are " + Arrays.toString(arr));
    }
}*/

/*
* Q. Take an input from the user and store all the squares of
* number from 1 to n into array an then print it

* */

/*public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i =0; i <n; i++) {
            System.out.println("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            arr[i]*=arr[i];
        }
        System.out.println("Elements of array are " + Arrays.toString(arr));
    }
}*/



/*
*
* Q. Take n inputs from user and print their cubes
* */

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i =0; i <n; i++) {
            System.out.println("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            arr[i]=arr[i]*arr[i]*arr[i];
        }
        System.out.println("Elements of array are " + Arrays.toString(arr));
    }
}