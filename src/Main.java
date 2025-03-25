import Package.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BankCustomers bank = new BankCustomers();

        bank.addAccount(new TransactionAccount("TA001", "Hana", 500));
        bank.addAccount(new TransactionAccount("TA002", "Erika", 800));
        bank.addAccount(new TransactionAccount("TA003", "Yasi", 1200));

        bank.addAccount(new SavingAccount("SA001", "Yasaman", 1000));
        bank.addAccount(new SavingAccount("SA002", "Hananeh", 1500));
        bank.addAccount(new SavingAccount("SA003", "Bahar", 2000));

        BankAccount foundAccountOne = bank.findAccount("SA010");
        BankAccount foundAccountTwo = bank.findAccount("TA001");
        if (foundAccountTwo != null) {
            System.out.println("Balance is: " +  foundAccountTwo.getBalance());
            foundAccountTwo.deposit(10000);
            System.out.println("Balance is: " +  foundAccountTwo.getBalance());
        }

        BankAccount interstTA = bank.findAccount("TA002");
        if (interstTA != null) {
            interstTA.calculateInterest();
            System.out.println("Balance is: " +  interstTA.getBalance());
        }

        BankAccount interstSA = bank.findAccount("SA002");
        if (interstSA != null) {
            interstSA.calculateInterest();
            System.out.println("Balance is: " +  interstSA.getBalance());
        }

        BankAccount invalidWithdrawSA = bank.findAccount("SA002");
        if (invalidWithdrawSA != null) {
            invalidWithdrawSA.withdraw(-100);
        }

        BankAccount invalidWithdrawTA = bank.findAccount("TA002");
        if (invalidWithdrawTA != null) {
            invalidWithdrawTA.withdraw(-100);
        }

        BankAccount exceedWithdrawSA = bank.findAccount("SA001");
        if (exceedWithdrawSA != null) {
            exceedWithdrawSA.withdraw(10000);
        }

        BankAccount exceedWithdrawTA = bank.findAccount("TA001");
        if (exceedWithdrawTA != null) {
            exceedWithdrawTA.withdraw(20000);
        }

        BankAccount withdrawSA = bank.findAccount("SA003");
        if (withdrawSA != null) {
            withdrawSA.withdraw(100);
        }

        BankAccount withdrawTA = bank.findAccount("TA003");
        if (withdrawTA != null) {
            withdrawTA.withdraw(100);
        }

        bank.showAllBalances();
    }
}
