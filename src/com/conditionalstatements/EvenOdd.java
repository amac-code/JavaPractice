package com.conditionalstatements;

//Write a Java program that takes an integer as input and prints whether it is an even or odd number.

import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        String result = check(num);
        System.out.println(result);
    }

    public static String check(int num){
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
