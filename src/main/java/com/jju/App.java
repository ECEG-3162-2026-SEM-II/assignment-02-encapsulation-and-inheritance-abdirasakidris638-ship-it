package com.jju;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        System.out.println("--- 🏦 Bank System Simulation ---\n");

        SavingsAccount mySavings = new SavingsAccount("Alice", 200.0, 0.10);
        System.out.println("Initial Savings: $" + mySavings.getBalance());
        mySavings.applyInterest();
        System.out.println("Savings after interest: $" + mySavings.getBalance());

        System.out.println("\n----------------------------------\n");

        CheckingAccount myChecking = new CheckingAccount("Bob", 100.0);
        System.out.println("Initial Checking: $" + myChecking.getBalance());
        
        myChecking.withdraw(40.0);
        System.out.println("Checking after $40 withdrawal: $" + myChecking.getBalance());

        System.out.println("\n----------------------------------\n");

        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(mySavings);
        accounts.add(myChecking);
        accounts.add(new BankAccount("Charlie", 500.0));

        System.out.println("Processing all accounts in the system:");
        for (BankAccount acc : accounts) {
            System.out.println("Account Holder: " + acc.getAccountHolder() + 
                               " | Balance: $" + acc.getBalance());
        }
    }
}