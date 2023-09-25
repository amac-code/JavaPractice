package com.mct;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        System.out.println("Simple Calculator");
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        double result;

        // Using a switch statement to perform calculations based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
        }

        input.close();*/

        System.out.println("Simple Calculator");
        System.out.print("Enter 1st number: ");
        double num1 = input.nextInt();
        System.out.print("Enter the operator(+, -, *, /): ");
        char operator = input.next().charAt(0);
        System.out.println();
        System.out.print("Enter 2nd number: ");
        double num2 = input.nextInt();


        double result;
        switch (operator){
            case '+':
                result= num1+num2;
                System.out.println(result);
                break;
            case '-':
                result= num1-num2;
                System.out.println(result);
                break;
            case '*':
                result= num1*num2;
                System.out.println(result);
                break;
            case '/':
                if(num2!=0) {
                    result = num1 / num2;
                    System.out.println(result);
                }else{
                    System.out.println("Error- Division by Zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid operator. Please try again");
        }
    }
}

