import java.util.ArrayList;


// ATM class simulates an ATM machine
public class ATM {
    // Instance variables
    private double balance; // Stores the account balance
    private int pin; // Stores the account PIN
    private ArrayList<String> transactionHistory; // Stores transaction history

    // Constructor to initialize the ATM with a starting balance and PIN
    public ATM(double initialBalance, int initialPin) {
        this.balance = initialBalance; // Set the initial balance
        this.pin = initialPin; // Set the initial PIN
        this.transactionHistory = new ArrayList<>(); // Initialize the transaction history
    }

    // Method to check the account balance
    public void checkBalance() {
        System.out.println("Your current balance is: $" + balance); // Display balance
        transactionHistory.add("Checked balance: $" + balance); // Log the transaction
    }

    // Method to deposit cash
    public void deposit(double amount) {
        if (amount > 0) { // Ensure the deposit amount is positive
            balance += amount; // Increase the balance
            System.out.println("You have deposited: $" + amount); // Confirm the deposit
            transactionHistory.add("Deposited: $" + amount); // Log the transaction
        } else {
            System.out.println("Invalid deposit amount."); // Error for non-positive deposit
        }
    }

    // Method to withdraw cash
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) { // Ensure the withdrawal amount is valid
            balance -= amount; // Decrease the balance
            System.out.println("You have withdrawn: $" + amount); // Confirm the withdrawal
            transactionHistory.add("Withdrew: $" + amount); // Log the transaction
        } else {
            System.out.println("Invalid withdrawal amount."); // Error for invalid withdrawal
        }
    }

    // Method to change the PIN
    public void changePin(int oldPin, int newPin) {
        if (this.pin == oldPin) { // Validate the old PIN
            this.pin = newPin; // Set the new PIN
            System.out.println("PIN changed successfully."); // Confirm the change
            transactionHistory.add("PIN changed."); // Log the transaction
        } else {
            System.out.println("Incorrect old PIN."); // Error for incorrect old PIN
        }
    }

    // Method to print the transaction history
    public void printTransactionHistory() {
        System.out.println("Transaction History:"); // Display header
        for (String transaction : transactionHistory) { // Loop through each transaction
            System.out.println(transaction); // Print the transaction
        }
    }

    // Method to validate the entered PIN
    public boolean validatePin(int inputPin) {
        return this.pin == inputPin; // Return true if PIN matches
    }
}




