import java.util.Scanner;

public class CheckEqualString {

    // Method to check if two strings are equal character by character
    public static boolean isEqual(String str1, String str2) {
        // If lengths are different, strings cannot be equal
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Check each character one by one
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Return false if any character doesn't match
            }
        }
        return true; // Return true if all characters match
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.println("Enter the first string:");
        String str1 = input.nextLine(); // Read the first string

        System.out.println("Enter the second string:");
        String str2 = input.nextLine(); // Read the second string

        // Check equality using both the custom isEqual method and the String.equals method
        if (isEqual(str1, str2) && str1.equals(str2)) {
            System.out.println("Strings are Equal");
          } else {
            System.out.println("Strings are not Equal");
          }
        input.close();
    }
}
