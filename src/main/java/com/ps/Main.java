package com.ps;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select a calculator: ");
        System.out.println("1) Mortgage Calculator");
        System.out.println("2) Future Calculator");
        System.out.println("3) Value Calculator");
        byte calculator = scanner.nextByte();


        switch(calculator){
            case 1:
                double total_interest;
                double monthly_payment;

                //      Get user input for principal amount, interest rate, loan length
                System.out.print("Enter the principal amount for the loan: ");
                float principal_amount = scanner.nextInt();

                System.out.print("Enter the interest rate for the loan: ");
                double interest_rate = scanner.nextFloat()/100;

                System.out.print("Enter the loan length: ");
                short length_of_loan = scanner.nextShort();

                //
                double monthly_interest = interest_rate/12;
                int num_payments = 12*length_of_loan;

                monthly_payment = (principal_amount*(Math.pow((monthly_interest*(1+monthly_interest)), num_payments))) / ((Math.pow(1+monthly_interest, num_payments)-1));
                total_interest = (monthly_payment*num_payments) - principal_amount;

                System.out.printf("Monthly payments are %.2f", monthly_payment);
                System.out.printf("Total interest amount is %.3f", total_interest);
                break;

            case 2:
                short days_per_year = 365;


                System.out.print("Enter the deposit amount: ");
                int principal = scanner.nextInt();

                System.out.print("Enter the interest rate: ");
                float annual_rate = scanner.nextFloat()/100;

                System.out.print("Enter the number of years: ");
                short num_years = scanner.nextShort();

                int total_days = 365*num_years;

                float future_value = (float)(principal*(Math.pow((1+(annual_rate/365)),(365*num_years))));

                float total_interest_2 = future_value - principal;

                System.out.printf("Future value is %.2f", future_value);
                System.out.printf("Total interest amount is %.3f", total_interest_2);
                break;

            case 3:



        }


    }
}