import java.util.Scanner;

public class UpperCaseComparison {

    // Method to convert text to uppercase using charAt()
    public static String convertToUppercase(String text) {
        String uppercaseText = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                uppercaseText += (char) (ch - 32); // Convert to uppercase using ASCII difference
            } else {
                uppercaseText += ch; // Append the character as is if not lowercase
            }
        }
        return uppercaseText;
    }

    // Method to compare two strings using charAt()
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

        // Take user input for the text
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        // Convert text to uppercase using String built-in method
        String builtInUppercase = text.toUpperCase();

        // Convert text to uppercase using custom method
        String customUppercase = convertToUppercase(text);

        // Compare the two uppercase results
        boolean areEqual = compareStrings(builtInUppercase, customUppercase);

        // Display the results
        System.out.println("\nOriginal Text: " + text);
        System.out.println("Uppercase using built-in method: " + builtInUppercase);
        System.out.println("Uppercase using custom method: " + customUppercase);
        System.out.println("Are both results equal? " + areEqual);

        scanner.close();
    }
}
