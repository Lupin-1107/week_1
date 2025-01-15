import java.util.*;

public class CheckSubstring {

    // Method to create a substring using charAt()
    public static String subStr(String str, int start, int end) {
        String str1 = ""; // Initialize an empty string
        for (int i = start; i < end; i++) {
            str1 += str.charAt(i); // Concatenate each character to the string
        }
        return str1; // Return the substring
    }

    // Method to compare two strings using charAt()
    public static boolean checkSubstr(String str1, String str2) {
        // Return false if lengths are not equal
        if (str1.length() != str2.length()) return false;

        // Compare each character of the strings
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true; // Return true if all characters match
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for the full sentence
        System.out.println("Enter the string :");
        String str = input.nextLine(); 

        System.out.println("Enter the start index:");
        int start = input.nextInt(); // Read start index

        System.out.println("Enter the end index:");
        int end = input.nextInt(); // Read end index

        // Generate substrings using both methods
        String str1 = str.substring(start, end); // Built-in substring method
        String str2 = subStr(str, start, end);   // Custom substring method

        // Compare the two substrings
        if (checkSubstr(str1, str2)) {
            System.out.println("Both substrings are the same");
        } else {
            System.out.println("Both substrings are not equal");
        }

        input.close(); // Close the Scanner
    }
}
