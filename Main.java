import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create an instance of the ATM class with an initial balance of $5000 and PIN 1234
        ATM atm = new ATM(5000.00, 1234);
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their PIN
        System.out.print("Enter your PIN: ");
        int enteredPin = scanner.nextInt();

        // Validate the entered PIN
        if (atm.validatePin(enteredPin)) {
            int option; // Variable to store the user's menu option

            do {
                // Display the ATM menu
                System.out.println("\nATM Menu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Cash");
                System.out.println("3. Withdraw Cash");
                System.out.println("4. Change PIN");
                System.out.println("5. Print Transaction History");
                System.out.println("6. Exit");

                // Prompt the user to choose an option
                System.out.print("Choose an option: ");
                option = scanner.nextInt();

                // Handle the user's menu option
                switch (option) {
                    case 1:
                        atm.checkBalance(); // Check balance
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        atm.deposit(depositAmount); // Deposit cash
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        atm.withdraw(withdrawAmount); // Withdraw cash
                        break;
                    case 4:
                        System.out.print("Enter old PIN: ");
                        int oldPin = scanner.nextInt();
                        System.out.print("Enter new PIN: ");
                        int newPin = scanner.nextInt();
                        atm.changePin(oldPin, newPin); // Change PIN
                        break;
                    case 5:
                        atm.printTransactionHistory(); // Print transaction history
                        break;
                    case 6:
                        System.out.println("Thank you for using the ATM. Goodbye!"); // Exit message
                        break;
                    default:
                        System.out.println("Invalid option. Please try again."); // Error for invalid option
                }
            } while (option != 6); // Continue until the user chooses to exit
        } else {
            System.out.println("Incorrect PIN. Access denied."); // Error for incorrect PIN
        }

        scanner.close(); // Close the scanner to prevent resource leak
    }
}