package packages;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Bank Account Manager
 */
public class BankAccountManager implements Bank {
    private Map<Integer, BankAccount> accounts;
    private int id;
    
    public int MAX_ACCOUNT = 100;

    public BankAccountManager() {
        this.accounts = new HashMap<>();
        this.id = 0;
    }

    // Adds a bank account
    public void addAccount(BankAccount account) {
        // Checks if the account limit is reached
        if (accounts.size() >= MAX_ACCOUNT) {
            System.out.println("Maximum number of account reached " + accounts.size() + "/" + MAX_ACCOUNT);
            return;
        }

        // Adds the account
        accounts.put(this.id, account);
        System.out.println("Account added successfully with ID: " + this.id);
        this.id++;
    }

    // Get account with id
    public void getAccount(int id) {
        BankAccount account = this.accounts.get(id);

        // Checks if there is an account with the id specified
        if (account == null) {
            System.out.println("Account not found.");
        }

        // Prints the user's details if found
        System.out.println("Account found!");
        System.out.println("ID: " + id + "\nAccount: " + account.getOwnerName() + "\nBalance: "
                + account.amountFormatter(account.getBalance()) + "\n");
    };

    // List all acounts created
    public void listAccounts() {
        // Checks if there are any account
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
            return;
        }

        System.out.println("List of all acounts: ");

        // Prints all account if there is any
        for (Map.Entry<Integer, BankAccount> entry : accounts.entrySet()) {
            Integer accountId = entry.getKey();
            BankAccount account = entry.getValue();

            System.out.println("ID: " + accountId + "\nAccount: " 
                    + account.getOwnerName() + "\nBalance: "
                    + account.amountFormatter(account.getBalance()) + "\n");
        }
    }

    public List<Transaction> filterTransactionsAtOrAbove(double amount, List<Transaction> txList) {
        if (txList == null) {
            return new ArrayList<>();
        }
        
        return txList.stream()
                .filter(t -> t != null && t.getAmount() >= amount)
                .collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByAmount(List<Transaction> txList) {
        if (txList == null) {
            return new ArrayList<>();
        }

        return txList.stream()
                .filter(t -> t != null)
                .sorted(Comparator.comparingDouble(Transaction::getAmount))
                .collect(Collectors.toList());
    }
}
