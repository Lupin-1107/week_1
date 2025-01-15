import java.util.Scanner;

public class IllegalArgumentExceptionProgram {

    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String input) {
        // Attempt to use substring with invalid indices (start > end)
        System.out.println("Substring: " + input.substring(5, 3)); // This line will throw IllegalArgumentException
    }

    // Method to handle IllegalArgumentException
    public static void handleIllegalArgumentException(String input) {
        try {
            // Attempt to use substring with invalid indices (start > end)
            System.out.println("Substring: " + input.substring(5, 3));
        } catch (IllegalArgumentException e) {
            // Handle the specific IllegalArgumentException
            System.out.println("Caught IllegalArgumentException: Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            // Handle any other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("\nCalling method to generate IllegalArgumentException:");
        try {
            generateIllegalArgumentException(input); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: IllegalArgumentException occurred.");
        }

        handleIllegalArgumentException(input); // This method handles the exception internally

        scanner.close();
    }
}
