package arrays;

//Problem 8: Write a Java program to calculate and print the average value of elements in an array of integers.

import java.util.*;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("\nElements of Array are: " + Arrays.toString(arr1));

        int sum = 0;
        float avg;
        for (int i = 0; i < n; i++) {

            sum = sum + arr1[i];

        }

        avg = (float) sum / n;

        System.out.println("\nSum of value of elements is: " + sum);

        System.out.println("\nAverage value of elements is: " + avg);
    }
}

