package packages;

/**
 * 
 * BankAccount
 */

public class BankAccount {
    private double balance;
    public boolean isFrozen;
    private String ownerName;

    public BankAccount() {
        this.balance = 0;
        this.isFrozen = false;
    }

    public String getOwnerName() {
        return "Account Owner: " + ownerName;
    }

    public void deposit(double amount) {
        if (isFrozen == false) {
            if (amount > 0) {
                this.balance += amount;
                System.out.println("Amount deposited:\n" + String.format("%.2f", amount));
                System.out.println("Current balance:\n" + String.format("%.2f", getBalance()));
            } else {
                this.balance += amount;
                System.out.println("Amount deposited:\n" + String.format("%.2f", amount));
                System.out.println("Invalid amount. Must be greater than 0");
            }
        } else {
            System.out.println("Account is FROZEN.\nUnable to transact.");
        }
    }

    public void withdraw(double amount) {
        if (isFrozen == false) {
            if (amount > 0 && amount <= getBalance()) {
                this.balance -= amount;
                System.out.println("Amount withdrawn:\n" + String.format("%.2f", amount));
                System.out.println("Current balance:\n" + String.format("%.2f", getBalance()));
            } else {
                if (amount <= 0) {
                    System.out.println("Amount withdrawn:\n" + String.format("%.2f", amount));
                    System.out.println("Invalid amount. Must be greater than 0");
                } else {
                    System.out.println("Amount withdrawn:\n" + String.format("%.2f", amount));
                    System.out.println("Insufficient balance.\nCurrent balance: " + String.format("%.2f", getBalance()));
                }
            }
        } else {
            System.out.println("Account is FROZEN.\nUnable to transact.");
        }
    }

    public double getBalance() {
        return this.balance;
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
}
