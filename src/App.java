import packages.BankAccount;
import packages.BankAccountManager;
import packages.SavingsAccount;

/**
 * Demonstrates banking account operations and account management.
 */
public class App {
    public static void main(String[] args) throws Exception {

        // Test Case 1
        BankAccount acc1 = new SavingsAccount("Test 0");
        BankAccountManager manager1 = new BankAccountManager();
        manager1.addAccount(acc1);
        System.out.println();
        System.out.println(acc1.getOwnerName());

        System.out.println();
        acc1.deposit(1000.125);

        System.out.println();
        acc1.withdraw(500);

        System.out.println();
        acc1.deposit(0);

        System.out.println();
        acc1.deposit(-500);

        System.out.println();
        acc1.getTransactionHistory();

        System.out.println();
        manager1.addAccount(new SavingsAccount("Test 1"));

        System.out.println();
        manager1.listAccounts();
        
        manager1.getAccount(0);
        
        System.out.println();
        
        manager1.filterTransactionsAtOrAbove(500, acc1.getTransactionHistory());

        manager1.sortTransactionsByAmount(acc1.getTransactionHistory());
    }
}
