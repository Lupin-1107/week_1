import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if the lengths are the same
        if (text1.length() != text2.length()) {
            return false; // Not anagrams if lengths are different
        }

        // Create arrays to store frequency of characters for both texts
        int[] frequency1 = new int[256]; // ASCII size of characters
        int[] frequency2 = new int[256];

        // Loop through the first text and update frequency
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++; // Increase the frequency count for text1
            frequency2[text2.charAt(i)]++; // Increase the frequency count for text2
        }

        // Compare the frequencies of characters
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false; // Not anagrams if frequencies don't match
            }
        }

        return true; // If all frequencies match, they are anagrams
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Check if the texts are anagrams
        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        scanner.close();
    }
}
