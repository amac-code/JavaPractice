package com.basics;

public class DataTypes {

    public static int dataTypes(String type) {
        // Using conditional statements to determine the size of the data type
        if ("byte".equalsIgnoreCase(type)) {
            return 1;
        } else if ("short".equalsIgnoreCase(type)) {
            return 2;
        } else if ("int".equalsIgnoreCase(type) || "integer".equalsIgnoreCase(type)) {
            return 4;
        } else if ("long".equalsIgnoreCase(type)) {
            return 8;
        } else if ("float".equalsIgnoreCase(type)) {
            return 4;
        } else if ("double".equalsIgnoreCase(type)) {
            return 8;
        } else if ("char".equalsIgnoreCase(type) || "character".equalsIgnoreCase(type)) {
            return 2;
        } else if ("boolean".equalsIgnoreCase(type)) {
            return 1;
        } else {
            return -1;  // return -1 if the type is not recognized
        }
    }

    public static void main(String[] args) {
        System.out.println(dataTypes("Long"));  // Output should be 8
        System.out.println(dataTypes("Float")); // Output should be 4
        System.out.println(dataTypes("Char"));
    }
}