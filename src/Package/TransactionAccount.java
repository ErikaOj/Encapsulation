package Package;

import java.util.*;

public class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest is not for transaction accounts.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (balance + overDraftLimit)) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully. New balance is: " + balance);
        } else {
            if(amount >= (balance + overDraftLimit) && amount > 0)
                System.out.println("Withdrawal is higher than the determined amount.");
            else
                System.out.println("Invalid amount");

        }
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

}
