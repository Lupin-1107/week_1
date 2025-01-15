import java.util.Scanner;

public class lexicographically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the two strings
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        
        int result = 0;
        
        // Compare character by character
        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                result = -1; // str1 comes first
                break;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                result = 1;  // str2 comes first
                break;
            }
        }

        // If strings are equal up to the length of the shortest string, compare lengths
        if (result == 0) {
            if (str1.length() < str2.length()) {
                result = -1; // str1 is shorter and comes first
            } else if (str1.length() > str2.length()) {
                result = 1;  // str1 is longer and comes after
            }
        }

        // Output result
        if (result == 0) {
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\".");
        } else if (result == -1) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
        } else {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.");
        }
    }
}
