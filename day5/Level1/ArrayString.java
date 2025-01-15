import java.util.*;

public class ArrayString {

    // User-defined method to convert a string to a character array
    public static char[] charString(String str) {
        char[] charString = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charString[i] = str.charAt(i); // Extract each character and store it in the array
        }
        return charString;
    }

    // Method to compare two char arrays
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        // Check if lengths are not equal
        if (arr1.length != arr2.length) {
            return false;
        }
        // Compare each character in the arrays
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false; // Return false if any character doesn't match
            }
        }
        return true; // Return true if all characters match
    }

    public static void main(String[] args) {
        // Scanner for input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = input.nextLine(); 

        // Convert the string into char arrays using both methods
        char[] charArray1 = str.toCharArray(); // Built-in method
        char[] charArray2 = charString(str);   // User-defined method

        // Compare the two arrays
        if (compareArrays(charArray1, charArray2)) {
            System.out.println("Both arrays are the same.");
        } else {
            System.out.println("Both arrays are not the same.");
        }

        input.close();    }
}
