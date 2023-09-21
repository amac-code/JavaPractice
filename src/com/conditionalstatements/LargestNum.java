package com.conditionalstatements;

//Write a program that takes three numbers as input and finds and prints the largest number among them.

import java.util.*;


public class LargestNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=3;

        int[] num = new int[n];
        for (int i = 0; i <n; i++) {
            System.out.print("Enter" + " number " + (i+1) + ": ");
            num[i] = sc.nextInt();
        }
        System.out.println("The numbers are: " + Arrays.toString(num));


        int max= Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            if(max<num[i]){
                max = num[i];
            }
        }
        System.out.println("Maximum number in it is: " + max);
    }
}
