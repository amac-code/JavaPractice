package com.mct;

public class FindSmallestNum {
    public static void main(String[] args) {
        int a = 45;
        int b = 20;
        int c = -10;

        int smallest = 0;
        if (a < b && a < c) {
            smallest = a;
        } else if (b < a && b < c) {
            smallest = b;
        } else {
            smallest = c;
        }
        System.out.println("Smallest is number is: " + smallest);
    }
}
