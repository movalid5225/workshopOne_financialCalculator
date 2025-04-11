package com.ps;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double total_interest;
        double monthly_payment;
        Scanner scanner = new Scanner(System.in);

//      Get user input for principal amount, interest rate, loan length
        System.out.print("Enter the principal amount for the loan: ");
        float principal_amount = scanner.nextInt();

        System.out.print("Enter the interest rate for the loan: ");
        double interest_rate = scanner.nextFloat();

        System.out.print("Enter the loan length: ");
        int length_of_loan = scanner.nextInt();

//
        double monthly_interest = interest_rate/12;
        int num_payments = 12*length_of_loan;

        monthly_payment = (principal_amount*(Math.pow((monthly_interest*(1+monthly_interest)), num_payments))) / ((Math.pow(1+monthly_interest, num_payments)-1));
        total_interest = (monthly_payment*num_payments) - principal_amount;

        System.out.printf("Monthly payments are %.2f", monthly_payment);
        System.out.printf("Total interest amount is %.3f", total_interest);


    }
}