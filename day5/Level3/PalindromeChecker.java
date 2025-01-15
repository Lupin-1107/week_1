import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Check if the text is a palindrome by comparing characters from start and end
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // Characters are not the same
            }
            start++;
            end--;
        }
        return true; // All characters matched
    }

    // Logic 2: Check if the text is a palindrome using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true; // Base case: All characters matched
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false; // Characters are not the same
        }
        return isPalindromeRecursive(text, start + 1, end - 1); // Recur with next pair of characters
    }

    // Logic 3: Check if the text is a palindrome by comparing original and reversed text
    public static boolean isPalindromeByReversal(String text) {
        // Convert text to char array
        char[] textArray = text.toCharArray();
        
        // Create the reverse of the text
        char[] reversedArray = new char[text.length()];
        int j = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedArray[j++] = textArray[i];
        }

        // Compare the original and reversed arrays
        for (int i = 0; i < text.length(); i++) {
            if (textArray[i] != reversedArray[i]) {
                return false; // Text is not palindrome
            }
        }
        return true; // Text is palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Logic 1: Iterative Palindrome Check
        if (isPalindromeIterative(input)) {
            System.out.println("Using Iterative Method: The text is a palindrome.");
        } else {
            System.out.println("Using Iterative Method: The text is not a palindrome.");
        }

        // Logic 2: Recursive Palindrome Check
        if (isPalindromeRecursive(input, 0, input.length() - 1)) {
            System.out.println("Using Recursive Method: The text is a palindrome.");
        } else {
            System.out.println("Using Recursive Method: The text is not a palindrome.");
        }

        // Logic 3: Reversal Palindrome Check
        if (isPalindromeByReversal(input)) {
            System.out.println("Using Reversal Method: The text is a palindrome.");
        } else {
            System.out.println("Using Reversal Method: The text is not a palindrome.");
        }

        scanner.close();
    }
}
