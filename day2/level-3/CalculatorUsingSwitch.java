import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare the variables
        double first, second;
        String op;

        // Get user input for first number, second number, and operator
        System.out.print("Enter the first number: ");
        first = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        second = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        op = scanner.next();

        // Perform the calculation based on the operator using switch...case
        double result = 0;
        boolean validOperator = true; // To check if operator is valid

        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperator = false;
                }
                break;
            default:
                System.out.println("Invalid Operator. Please enter +, -, *, or /.");
                validOperator = false;
                break;
        }

        // Print the result if the operator is valid
        if (validOperator) {
            System.out.println("Result: " + result);
        }

        // Close the scanner
        scanner.close();
    }
}
