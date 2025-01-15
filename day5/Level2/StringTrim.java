import java.util.Scanner;

public class StringTrim {

    // Method to find the start and end index after trimming leading and trailing spaces
    public static int[] trimSpaces(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Find the index where the first non-space character occurs (leading spaces)
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find the index where the last non-space character occurs (trailing spaces)
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end}; // Return both start and end indices
    }

    // Method to create a substring using charAt() method from the given start and end indices
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i)); // Append characters between start and end indices
        }
        return result.toString();
    }

    // Method to compare two strings and return true if they are equal, else false
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String inputText = scanner.nextLine();

        // Trim leading and trailing spaces using the charAt() method
        int[] trimIndices = trimSpaces(inputText);
        String trimmedText = createSubstring(inputText, trimIndices[0], trimIndices[1]);

        // Trim the string using the built-in trim() method
        String builtInTrimmedText = inputText.trim();

        // Compare the trimmed string using the charAt() method with the built-in trim method
        boolean isEqual = compareStrings(trimmedText, builtInTrimmedText);

        // Display the result
        System.out.println("Trimmed text using charAt(): " + trimmedText);
        System.out.println("Trimmed text using built-in trim(): " + builtInTrimmedText);
        System.out.println("Are both trimmed strings equal? " + isEqual);

        scanner.close();
    }
}
