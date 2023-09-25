package com.mct;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        //do while
        int sum = 0;
        int num;
        do {
            System.out.print("Enter a number (0 to exit): ");
            num = sc.nextInt();
            sum +=num;
        }while(num!=0);

        System.out.println("Sum of the numbers are: " + sum);
        sc.close();

        //while loop
        /*
        int i= 1;
        while(i<5){
            System.out.println(i);
            i++;
        }

        //for loop
        for (int j = 1; j <= 5; i++) {
            System.out.println("Iteration " + j);
        }

        //for each loop
        int[] arr = {1,3,4,5,2,4};
        for(int elements:arr){
            System.out.println("num:" + elements);
        }
        */
    }
}
