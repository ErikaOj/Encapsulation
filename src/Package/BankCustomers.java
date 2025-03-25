package Package;

import java.util.*;

public class BankCustomers {
    private final ArrayList<BankAccount> accountsList = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accountsList.add(account);
    }

    public void showAllBalances() {
        for (BankAccount account : accountsList) {
            System.out.println("Account: " + account.getAccountNumber() +
                    ", Holder: " + account.getAccountHolderName() +
                    ", Balance: " + account.getBalance());
        }
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        System.out.println("Account not found.");
        return null;
    }
}
