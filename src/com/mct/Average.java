package com.mct;

public class Average {
    public static void main(String[] args) {

        double result = findAvg(10, 20, 30);

        System.out.println("Average is: " + result);

    }

    public static double findAvg(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        double avg = sum / 3;
        return avg;
    }
}

