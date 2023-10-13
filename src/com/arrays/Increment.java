package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();


        int[] arr= new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("Element " + (i+1) + ": ");
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        if(arr[n-1]==arr[n-1]){
            arr[n-1]+=1;
        }

        System.out.println(Arrays.toString(arr));

    }
}
