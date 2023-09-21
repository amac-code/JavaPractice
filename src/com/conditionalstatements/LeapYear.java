package com.conditionalstatements;

//Write a program that determines if a given year is a leap year or not.
//A leap year is divisible by 4 but not divisible by 100, except when it is also divisible by 400.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] unk) {
        Scanner sc = new Scanner(System.in);
        //ver1 w/o while loop
        /*System.out.print("Enter the year (eg. 1993 or 2023): ");
        int year = sc.nextInt();
        String result = calculate(year);
        System.out.println(result);*/

        //ver2 with while loop
        while (true) {
            System.out.print("Enter the year(eg. 1993 or 2023) or 0 to exit the program: ");
            int year = sc.nextInt();
            if (year == 0) {
                System.out.println("Exiting the program.");
                break;
            }

            String result = calculate(year);
            System.out.println(result);
        }

        sc.close();
    }

    public static String calculate(int year) {

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return "Leap year";
        } else {
            return "Not a leap year";
        }
    }
}
