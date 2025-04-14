package com.ps;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      Scanner instance to get user input anytime in the program
        Scanner scanner = new Scanner(System.in);

//      Displays the different calculator options and prompts user to choose one
            System.out.println("1) Mortgage Calculator");
            System.out.println("2) Future Value Calculator");
            System.out.println("3) Annuity Calculator");
            System.out.print("Please select a calculator: ");

//      User chooses a calculator 1-3 and the scanner stores input into a byte for efficiency
            byte calculator = scanner.nextByte();

//      Handles any input not 1-3
            while (calculator < 1 || calculator > 3) {
                System.out.print("Please select a calculator: ");

//          updates user input into calculator
                calculator = scanner.nextByte();
            }


//      switch statements for different calculators
            switch (calculator) {
//          Case for mortgage calculator
                case 1:
                    //      Get user input for principal amount, interest rate, loan length
                    System.out.print("Enter the principal amount for the loan: ");
                    float principal_amount = scanner.nextInt();

//              Get user input for interest rate
                    System.out.print("Enter the interest rate for the loan: ");
                    double interest_rate = scanner.nextFloat() / 100;

//              Get user input for loan length
                    System.out.print("Enter the loan length: ");
                    short length_of_loan = scanner.nextShort();

                    double monthly_interest = interest_rate / 12;
                    int num_payments = 12 * length_of_loan;

//              Calculate the monthly payments and total interest
                    double monthly_payment = (principal_amount * monthly_interest * Math.pow(1 + monthly_interest, num_payments)) /
                            (Math.pow(1 + monthly_interest, num_payments) - 1);
                    double total_interest = (monthly_payment * num_payments) - principal_amount;

//              Print out the monthly payments per month
                    System.out.printf("Monthly payments are %.2f", monthly_payment);
                    System.out.println(" per month");
                    System.out.printf("Total interest amount is %.2f", total_interest);
                    break;

                case 2:
//              Get user input for deposit amount
                    System.out.print("Enter the deposit amount: ");
                    double principal = scanner.nextDouble();

//              Get user input for interest rate
                    System.out.print("Enter the interest rate: ");
                    double annual_rate = scanner.nextDouble() / 100;

//              Get user input for number of years
                    System.out.print("Enter the number of years: ");
                    short num_years = scanner.nextShort();

                    int total_days = 365 * num_years;

//              Calculate the future value and total interest
                    double future_value = principal * Math.pow(1 + (annual_rate / 365), total_days);
                    double total_interest_2 = future_value - principal;

//              Print out the future value and total interest
                    System.out.printf("Future value is %.2f", future_value);
                    System.out.println();
                    System.out.printf("Total interest amount is %.2f", total_interest_2);
                    break;

                case 3:
//              Get user input for monthly payout value
                    System.out.println("Enter the monthly payout value: ");
                    double monthly_payout = scanner.nextDouble();

//              Get user input for interest rate
                    System.out.println("Enter the expected interest rate: ");
                    double monthly_rate = (scanner.nextDouble() / 100) / 12;

//              Get user input for total number of years
                    System.out.println("Enter the number of years: ");
                    int num_of_years = scanner.nextInt();

                    int total_months = num_of_years * 12;

//              Calculate the present value
                    double present_value = monthly_payout * ((1 - Math.pow((1 + monthly_rate), -1 * total_months))) / monthly_rate;

//              Prints out the value needed to invest today
                    System.out.printf("You would need to invest %.2f today", present_value);
                    break;
            }
        }
    }