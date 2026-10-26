package packages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * BankAccount
 */

public class BankAccount {
    private double balance;
    private boolean isFrozen;
    private String ownerName;
    private List<Transaction> transactionHistory;

    public BankAccount() {
        this.balance = 0;
        this.isFrozen = false;
        this.transactionHistory = new ArrayList<Transaction>();
    }

    public String getOwnerName() {
        return "Account Owner: " + ownerName;
    }

    // Deposit money in account
    public void deposit(double amount) {
        // Checks if account is frozen
        if (isFrozen() == true) {
            System.out.println("Account is FROZEN.\nUnable to transact.");
            return;
        }

        // Checks if amount is less than or equal to 0
        if (amount <= 0) {
            System.out.println("Amount deposited:\n" + amountFormatter(amount));
            System.out.println("Invalid amount. Must be greater than 0");
            return;
        }

        // Updates balance if it passed the check
        this.balance += amount;
        this.transactionHistory.add(new Transaction("Deposit", amount));
        System.out.println("Amount deposited:\n" + amountFormatter(amount));
        System.out.println("Current balance:\n" + amountFormatter(this.getBalance()));
    }

    // Withdraw money in account
    public void withdraw(double amount) {
        // Checks if account is frozen
        if (isFrozen() == true) {
            System.out.println("Account is FROZEN.\nUnable to transact.");
            return;
        }

        // Checks if amount is less than or equal to 0
        if (amount <= 0) {
            System.out.println("Amount withdrawn:\n" + amountFormatter(amount));
            System.out.println("Invalid amount. Must be greater than 0");
            return;
        }

        // Updates balance if it passed the check
        this.balance -= amount;
        this.transactionHistory.add(new Transaction("Withdraw", amount));
        System.out.println("Amount withdrawn:\n" + amountFormatter(amount));
        System.out.println("Current balance:\n" + amountFormatter(this.getBalance()));
    }

    public double getBalance() {
        return this.balance;
    }

    public String amountFormatter(double amount) {
        return String.format("%.2f", amount);
    }

    public void freezeAccount() {
        this.isFrozen = true;
    }

    public void unfreezeAccount() {
        this.isFrozen = false;
    }

    public boolean isFrozen() {
        return this.isFrozen;
    }

    // Lists the transaction history
    public void getTransactionHistory() {
        System.out.println("Account: " + getOwnerName());
        Iterator<Transaction> history = this.transactionHistory.iterator();
        
        while (history.hasNext()) {
            Transaction hist = history.next();
            System.out.println(hist);
        }
    }
}
