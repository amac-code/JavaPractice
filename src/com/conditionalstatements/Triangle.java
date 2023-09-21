/*
package com.conditionalstatements;
// Create a program that takes three side lengths as input and
    i.  determines if they can form a triangle.
    ii. If they can, determine and print whether the triangle is equilateral, isosceles, or scalene.
                        //equilateral: X = Y = Z.
                        //isosceles:  X = Y or X = Z or Y = Z.
                        //scalene: X!=Y && X!=Z && Y !=Z




import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Side 1: ");
        int x = sc.nextInt();
        System.out.print("Enter length of Side 2: ");
        int y = sc.nextInt();
        System.out.print("Enter length of Side 3: ");
        int z = sc.nextInt();

        if(x == y && x == z){
            System.out.println("Triangle is equilateral");
        }else if(x==y || y==z || x==z){
            System.out.println("Triangle is isosceles");
        }else{
            System.out.println("Triangle is scalene");
        }
    }

}
*/
