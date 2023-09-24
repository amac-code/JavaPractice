package com.conditionalstatements;
// Create a program that takes three side lengths as input and
//    i.  determines if they can form a triangle.
//    ii. If they can, determine and print whether the triangle is equilateral, isosceles, or scalene.
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



/*import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lengths of three sides of a triangle:");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        if (isTriangle(side1, side2, side3)) {
            String triangleType = classifyTriangle(side1, side2, side3);
            System.out.println("These sides form a " + triangleType + " triangle.");
        } else {
            System.out.println("These sides cannot form a triangle.");
        }

        sc.close();
    }

    // Check if the given sides can form a triangle
    public static boolean isTriangle(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }

    // Classify the type of triangle based on side lengths
    public static String classifyTriangle(double a, double b, double c) {
        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}*/
          