package packages;

public class BankAccount {
    private double balance;
    public boolean isFrozen;

    public BankAccount() {
        this.balance = 0;
        this.isFrozen = false;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Amount deposited:\n" + amount);
            System.out.println("Current balance:\n" + getBalance());
        } else {
            this.balance += 0;
            System.out.println("Amount deposited:\n" + amount);
            System.out.println("Invalid amount. Must be greater than 0");
        }
    }
    
    public void withdraw(double amount) {
        this.balance -= amount;
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
        return false;
    }

    public static void main(String[] args) {
        BankAccount bnk = new BankAccount();

        bnk.deposit(0);
    }
}
