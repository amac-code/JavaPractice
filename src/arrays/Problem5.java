package arrays;


//Problem 5: Write a Java program to reverse the elements of an integer array. For example,
// if the input array is [1, 2, 3, 4, 5], the program should modify the array to become [5, 4, 3, 2, 1].

import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("\nArray 1 is: " + Arrays.toString(arr1));

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[n - i - 1];
        }
        System.out.println("\nArray 2 (After reversing Array 1): " + Arrays.toString(arr2));
    }
}
