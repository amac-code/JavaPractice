package arrays;

//Problem 7: Write a Java program that counts and prints the number of even integers in an array of integers.
//Input:
//        Input Array: [12, 7, 8, 15, 10, 14, 22]
//Output:
//        Number of Even Integers: 5


import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("\nElements of Array are: " + Arrays.toString(arr1));

        int evenInt = 0 ;
        for (int i = 0; i < n; i++) {
            if(arr1[i]%2==0){
                evenInt++;
            }
        }
        System.out.println("\nNumber of Even Integers are: " + evenInt);
    }
}
