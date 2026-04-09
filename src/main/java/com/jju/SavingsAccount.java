package com.jju;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    // THIS CONSTRUCTOR IS REQUIRED:
    public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        deposit(interest);
    }

    public double getInterestRate() {
        return interestRate;
    }
}
