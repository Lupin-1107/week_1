import java.util.Scanner;

public class CharacterFrequencyWithUniqueCharacter {

    // Method to find unique characters in a string using charAt() method
    public static char[] uniqueCharacters(String text) {
        int length = text.length();
        boolean[] isDuplicate = new boolean[length];  // Array to track duplicates
        int uniqueCount = 0;  // Counter for unique characters
        char[] uniqueChars = new char[length];  // Array to store unique characters

        // Loop through the string to find unique characters
        for (int i = 0; i < length; i++) {
            if (!isDuplicate[i]) {
                char currentChar = text.charAt(i);
                uniqueChars[uniqueCount] = currentChar;  // Add unique character
                uniqueCount++;

                // Mark duplicate characters
                for (int j = i + 1; j < length; j++) {
                    if (text.charAt(j) == currentChar) {
                        isDuplicate[j] = true;  // Mark as duplicate
                    }
                }
            }
        }

        // Create a new array with the exact size of unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        // Array to store the frequency of characters using ASCII values as indices
        int[] frequency = new int[256];

        // Loop through the string to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Call the uniqueCharacters method to get the unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);  // Character
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);  // Frequency
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find character frequencies
        String[][] frequencyData = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println("Character: " + frequencyData[i][0] + ", Frequency: " + frequencyData[i][1]);
        }

        scanner.close();
    }
}
