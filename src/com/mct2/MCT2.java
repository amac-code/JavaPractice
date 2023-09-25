package com.mct2;

//sum of odd elements

import java.util.*;
public class MCT2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();


        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("Enter element " + (i+1) );
            arr[i] = sc.nextInt();
        }

        int sum =0;
        for(int i=0; i<n;i++){
            if(i%2!=0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }


}
