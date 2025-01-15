import java.util.Scanner;

public class FindLength{

    // Method to find and return the length of a string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            // Using an infinite loop to count characters until charAt() throws an exception
            while (true) {
                text.charAt(count); // Try accessing the character at the given index
                count++; // Increment the count for each character
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception will be thrown when the end of the string is reached
            return count; // Return the final count (length of the string)
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a string:");
        String inputText = scanner.next(); // Read a string

        // Calling the user-defined method to find the length
        int customLength = findLength(inputText);

        // Calling the built-in length() method to find the length
        int builtInLength = inputText.length();

        // Displaying the results
        System.out.println("Length of the string (using user-defined method): " + customLength);
        System.out.println("Length of the string (using built-in method): " + builtInLength);

        scanner.close();
    }
}
