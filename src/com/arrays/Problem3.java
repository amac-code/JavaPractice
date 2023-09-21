package arrays;

//Problem 3: Write a Java program that calculates and prints the sum of all elements in an integer array.

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("\nElements of Arrays are: " + Arrays.toString(arr1));

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr1[i];
        }
        System.out.println("\nSum of all elements of Array is: " + sum);

    }

}

