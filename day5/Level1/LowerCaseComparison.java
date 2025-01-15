import java.util.Scanner;

public class LowerCaseComparison {

    // Method to convert each character to lowercase if it's uppercase
    public static String convertToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase to lowercase using ASCII value
                result += (char) (ch + 32); // Append converted character
            } else {
                // Leave other characters as is
                result += ch; // Append original character
            }
        }
        return result;
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        // Strings are equal if they have the same length and characters
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

        // Taking input from the user
        System.out.println("Enter a complete text:");
        String inputText = scanner.nextLine();

        // Converting the input text to lowercase using built-in method
        String lowerCaseText = inputText.toLowerCase();

        // Converting the input text to lowercase using custom method
        String customLowerCaseText = convertToLowerCase(inputText);

         // Comparing the lowercase results using the custom compare method
         boolean isEqual = compareStrings(lowerCaseText, customLowerCaseText);

        // Display the results
        System.out.println("Original Text: " + inputText);
        System.out.println("Lowercase Text (Built-in Method): " + lowerCaseText);
        System.out.println("Lowercase Text (Custom Method): " + customLowerCaseText);
        System.out.println("Are both results equal? " + isEqual);
       

       

        scanner.close();
    }
}
