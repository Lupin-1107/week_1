import java.util.Scanner;

public class CharacterFrequency1 {

    // Method to find the frequency of characters in a string
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];  // Array to store frequency of characters (256 for ASCII characters)
        
        // Calculate frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Count the number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create an array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Store the characters and their frequencies in the result array
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);  // Character
                result[index][1] = String.valueOf(frequency[i]);  // Frequency
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find character frequencies
        String[][] frequencies = findFrequency(input);

        // Display the results
        System.out.println("Character Frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + ": " + frequencies[i][1]);
        }

        scanner.close();
    }
}
