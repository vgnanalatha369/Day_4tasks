
import java.util.*;

public class Bank {
    public static void main(String[] args) {

        HashMap<Integer, Double> accounts = new HashMap<>();

        // 1. Create new bank accounts
        accounts.put(1001, 5000.0);
        accounts.put(1002, 10000.0);
        accounts.put(1003, 7500.0);

        System.out.println("Initial Bank Accounts:");
        System.out.println(accounts);

        // 2. Deposit money into an account
        int depositAccount = 1001;
        double depositAmount = 2000.0;

        if (accounts.containsKey(depositAccount)) {
            double balance = accounts.get(depositAccount);
            accounts.put(depositAccount, balance + depositAmount);

            System.out.println("\nDeposited: " + depositAmount);
        } else {
            System.out.println("\nAccount Not Found!");
        }

        // 3. Withdraw money from an account
        int withdrawAccount = 1002;
        double withdrawAmount = 3000.0;

        if (accounts.containsKey(withdrawAccount)) {
            double balance = accounts.get(withdrawAccount);

            if (balance >= withdrawAmount) {
                accounts.put(withdrawAccount, balance - withdrawAmount);
                System.out.println("Withdrawn: " + withdrawAmount);
            } else {
                System.out.println("Insufficient Balance!");
            }
        } else {
            System.out.println("Account Not Found!");
        }

        // 4. Check account balance
        int searchAccount = 1003;

        if (accounts.containsKey(searchAccount)) {
            System.out.println("\nAccount Balance: "
                    + accounts.get(searchAccount));
        } else {
            System.out.println("\nAccount Not Found!");
        }

        // 5. Use getOrDefault() for non-existing accounts
        System.out.println("\nBalance of Account 1004: "
                + accounts.getOrDefault(1004, 0.0));

        // 6. Display all account numbers and balances
        System.out.println("\nAll Bank Accounts:");

        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            System.out.println("Account Number: " + entry.getKey()
                    + ", Balance: " + entry.getValue());
        }

        // 7. Calculate total balance
        double totalBalance = 0;

        for (double balance : accounts.values()) {
            totalBalance += balance;
        }

        System.out.println("\nTotal Balance in Bank: " + totalBalance);

        // 8. Remove an account
        accounts.remove(1003);

        System.out.println("\nAfter Removing Account 1003:");
        System.out.println(accounts);
    }
}
