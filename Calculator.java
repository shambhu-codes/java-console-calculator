import java.util.Scanner;
public class Calculator {

    // Method for Addition
    public static double addition(double a, double b) {
        return a + b;
    }

    // Method for Subtraction
    public static double subtraction(double a, double b) {
        return a - b;
    }

    // Method for Multiplication
    public static double Multiplication(double a, double b) {
        return a * b;
    }

    // Method for Division
    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        // Loop until user exits
        do {
            System.out.println("\n----- Calculator Menu -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result = " + addition(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result = " + subtraction(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result = " + Multiplication(num1, num2));
                        break;
                    case 4:
                        System.out.println("Result = " + division(num1, num2));
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Exiting Calculator. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please enter 1 to 5.");
            }

        } while (choice != 5);

        sc.close();
    }
}
