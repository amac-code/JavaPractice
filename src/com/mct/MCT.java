package com.mct;

import java.util.*;

public class MCT {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i=0; i< arr.length; i++){
            Scanner sc = new Scanner(System.in);
            arr[i]=sc.nextInt();
        }

        for (int elements: arr){
            System.out.print(elements);
            if (elements != arr[arr.length - 1]) {
                System.out.print(", ");
            }
        }


    }
}
