package packages;

public class SavingsAccount extends BankAccount {
    private String ownerName;

    public String getOwnerName() {
        return ownerName;
    }

    public SavingsAccount(String ownerName) {
        super();
        this.ownerName = ownerName;
    }
}
