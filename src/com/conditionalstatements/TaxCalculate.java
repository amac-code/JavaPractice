package com.conditionalstatements;

/*
* Create a program that calculates income tax based on a given income amount and tax brackets.
* For example, if the income is $50,000, the program should calculate the tax amount based on the tax rates for different income brackets.
*/



import java.util.Scanner;

public class TaxCalculate {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print(
                "\n####### Tax Brackets #######\n" +
                "* Rs 0 to Rs 3 lakh - 0%\n" +
                "* Rs 3 lakh to 6 lakh - 5%\n" +
                "* Rs 6 lakh to 9 lakh - 10%\n" +
                "* Rs 9 lakh to Rs 12 lakh - 15%\n" +
                "* Rs 12 lakh to Rs 15 lakh - 20%\n" +
                "* Above Rs 15 lakh - 30%");

        System.out.print("\n\nEnter the amount(eg. 1300000): ");
        int amt = sc.nextInt();
        double tax;

        if (amt>=0 && amt<=3_00_000){ //Income between Rs 0 to Rs 3 lakh- 0%
            tax = 0;
            System.out.println("Tax Exempted");
        }else if (amt>300000 && amt<=6_00_000){ //Income between Rs 3 lakh to 6 lakh- 5%
            tax = 0.05 * amt;
            System.out.println("Tax payable is: " + tax);
        }else if (amt>6_00_000 && amt<=9_00_000){ //Income between Rs 6 lakh to 9 lakh- 10%
            tax = 0.10 * amt;
            System.out.println("Tax payable is: " + tax);
        }else if (amt>9_00_000 && amt<=12_00_000){ //Income between Rs 9 lakh to Rs 12 lakh- 15%
            tax = 0.15 * amt;
            System.out.println("Tax payable is: " + tax);
        }else if (amt>12_00_000 && amt<=15_00_000){ //Income between Rs 12 lakh to Rs 15 lakh- 20%
            tax = 0.2 * amt;
            System.out.println("Tax payable is: " + tax);
        }else if(amt>15_00_000){ //>Income above Rs 15 lakh - 30%
            tax = 0.3 * amt;
            System.out.println("Tax payable is: " + tax);
        }

    }
}
