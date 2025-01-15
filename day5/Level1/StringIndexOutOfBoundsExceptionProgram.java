import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionProgram {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String input) {
        // Access an index beyond the length of the String
        System.out.println("Character at index 10: " + input.charAt(10)); // This line will throw StringIndexOutOfBoundsException
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String input) {
        try {
            // Access an index beyond the length of the String
            System.out.println("Character at index 10: " + input.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Caught StringIndexOutOfBoundsException: Index is out of bounds for the string.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string of length less than 10: ");
        String input = scanner.nextLine();

        
        try {
            generateStringIndexOutOfBoundsException(input); // This will throw an exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: StringIndexOutOfBoundsException occurred.");
        }

        System.out.println("\nCalling method to handle StringIndexOutOfBoundsException:");
        handleStringIndexOutOfBoundsException(input); // This method handles the exception internally

        scanner.close();
    }
}
