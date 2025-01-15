import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if the character is a vowel or consonant
    public static String checkCharacter(char ch) {
        // Convert the character to lowercase if it is uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert uppercase to lowercase
        }
        
        // Check if the character is a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant"; // If not a vowel, it's a consonant
            }
        }
        
        return "Not a Letter"; // If it's not a letter
    }

    // Method to find vowels and consonants in a string and return their counts
    public static int[] findVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Traverse through the string and count vowels and consonants
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            String result = checkCharacter(currentChar);

            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        // Return the counts in an array: index 0 for vowels, index 1 for consonants
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();

        // Call the findVowelsAndConsonants method
        int[] counts = findVowelsAndConsonants(inputText);

        // Display the results
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        scanner.close();
    }
}
