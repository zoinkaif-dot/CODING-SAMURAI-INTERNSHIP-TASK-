import java.util.Scanner;

public class BasicCalculator {

    // Method for addition
    static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    static double divide(double a, double b) {
        if (b != 0)
            return a / b;
        else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2;

        do {
            System.out.println("\n--- BASIC CALCULATOR ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
            } else {
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Result = " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result = " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result = " + multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Result = " + divide(num1, num2));
                    break;
                case 5:
                    System.out.println("Calculator Closed.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}
