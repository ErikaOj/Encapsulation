package Package;

import java.util.*;

public abstract class BankAccount {
    private final String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully. New balance is: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully. New balance is: " + balance);
        } else {
            if(amount >= balance && amount > 0)
                System.out.println("The amount is more than your balance.");
            else
                System.out.println("Invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    //اضافه بر خواسته ی پروژه. چون قیلد فاینال نبود به ذهنم رسید
    public void setAccountHolderName(String newName) {
        if (newName != null) {
            this.accountHolderName = newName;
        } else {
            System.out.println("Invalid name.");
        }
    }

}
