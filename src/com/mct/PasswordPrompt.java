package com.mct;

import java.util.Scanner;
public class PasswordPrompt {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPassword;

        do {
            System.out.print("Enter the password: ");
            inputPassword = scanner.nextLine();
        } while (!inputPassword.equals("abc123"));

        System.out.println("Password accepted.");
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();
        }while(!password.equals("abc123"));
        System.out.println("Password Accepted");
    }
}
