import java.util.Scanner;

public class NumberFormatExceptionProgram {

    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String input) {
        // Attempt to parse an invalid number from the string
        System.out.println("Parsed number: " + Integer.parseInt(input)); // This line will throw NumberFormatException
    }

    // Method to handle NumberFormatException
    public static void handleNumberFormatException(String input) {
        try {
            // Attempt to parse an invalid number from the string
            System.out.println("Parsed number: " + Integer.parseInt(input));
        } catch (NumberFormatException e) {
            // Handle the specific NumberFormatException
            System.out.println("Caught NumberFormatException: Invalid input, cannot convert to a number.");
        } catch (RuntimeException e) {
            // Handle any other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input as a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        try {
            generateNumberFormatException(input); // This will throw an exception
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: NumberFormatException occurred.");
        }

        handleNumberFormatException(input); // This method handles the exception internally

        scanner.close();
    }
}
