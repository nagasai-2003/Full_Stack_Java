// BankAccount class demonstrating encapsulation
class BankAccount {
    // Private variables (attributes)
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0.0; // Initial balance is 0
    }

    // Getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}
class EncapsulationExample {
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account = new BankAccount("Alice Johnson", "ACC123456");

        // Display account details
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Deposit money
        account.deposit(500);
        System.out.println("Current Balance: $" + account.getBalance());

        // Withdraw money
        account.withdraw(200);
        System.out.println("Current Balance: $" + account.getBalance());

        // Attempt to withdraw more than the balance
        account.withdraw(400); // Should display an error message
        System.out.println("Current Balance: $" + account.getBalance());
    }
}
