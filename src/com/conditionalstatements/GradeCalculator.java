package com.conditionalstatements;

//Create a program that calculates a student's grade based on their score.
//Use the following grading scale: A (90-100), B (80-89), C (70-79), D (60-69), F (0-59).

import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        char result = calculate(marks);
        System.out.println("Grade is: " + result);

    }

    public static char calculate(int marks){
        char grade;

        if (marks <= 100 && marks >= 90) { //90-100
            grade = 'A';

        } else if (marks < 90 && marks >= 80) { //80-89
            grade = 'B';

        } else if (marks < 80 && marks >= 70) { //70-79
            grade = 'C';

        } else if (marks < 70 && marks >= 60) { // 60-69
            grade = 'C';

        } else  { //0-59
            grade = 'E';
        }
        return grade;
    }
}
