package com.bridgelabz;

import java.util.Scanner;

public class AccountTest {

    private double balance;

    // validate that initialBalance is greater than 0.0;
    // if it is not, balance is initialized to the default value 0.0
    public AccountTest(double initialBalance) {
        if (initialBalance > 0.0)
            balance = initialBalance;
    }

    void debitAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Amount : ");
        double debitCash = scanner.nextDouble();
        if (debitCash > balance) {
            System.out.println("Debit amount exceeded account balance");
        } else {
            balance -= debitCash;
            System.out.println(balance);
        }
    }
}
