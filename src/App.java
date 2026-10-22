import packages.BankAccount;
import packages.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        // Test Case 1
        BankAccount acc1 = new SavingsAccount("Test 0");
        System.out.println(acc1.getOwnerName());
        
        // Test Case 2
        acc1.deposit(1000.125);

        // Test Case 3
        acc1.deposit(0);
        
        // Test Case 4
        acc1.deposit(-500);

        // Test Case 5
        BankAccount acc2 = new SavingsAccount("Test 1");
        System.out.println(acc2.getOwnerName());

        acc2.deposit(500.13);
        acc2.withdraw(500);

        // Test Case 6
        acc2.withdraw(1500);
        
        // Test Case 7
        acc2.withdraw(-100);

        // Test Case 8 
        acc2.freezeAccount();
        acc2.deposit(111500);

        // Test Case 9
        acc2.withdraw(500);

        // Test Case 10
        acc2.unfreezeAccount();
        acc2.deposit(400);
        acc2.withdraw(100);


    }
}
