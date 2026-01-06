import java.util.Scanner;

public class SimpleATM {

    // Array to store account balances
    static double[] balances = {5000, 3000, 10000};

    // Method to check balance
    static void checkBalance(int user) {
        System.out.println("Your current balance is: ₹" + balances[user]);
    }

    // Method to deposit money
    static void deposit(int user, double amount) {
        if (amount > 0) {
            balances[user] += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    static void withdraw(int user, double amount) {
        if (amount > 0 && amount <= balances[user]) {
            balances[user] -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else if (amount > balances[user]) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = 0; // Selecting first user account
        int choice;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance(user);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    deposit(user, dep);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double wit = sc.nextDouble();
                    withdraw(user, wit);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
