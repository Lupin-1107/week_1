import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) {
        // Convert the text to a character array
        char[] textArray = text.toCharArray();
        int length = textArray.length;

        // Array to store the frequency of characters
        int[] frequency = new int[length];

        // 1D array to store the characters and their frequencies as strings
        String[] result = new String[length];

        // Loop through the string using nested loops
        for (int i = 0; i < length; i++) {
            // If the character is already counted, skip it
            if (textArray[i] == '0') {
                continue;
            }

            // Initialize frequency of current character to 1
            frequency[i] = 1;

            // Inner loop to check for duplicates
            for (int j = i + 1; j < length; j++) {
                if (textArray[i] == textArray[j]) {
                    frequency[i]++; // Increment frequency for duplicate characters
                    textArray[j] = '0'; // Mark duplicate character as '0' to avoid recounting
                }
            }

            // Store the character and its frequency as a string in the result array
            result[i] = String.valueOf(textArray[i]) + ":" + frequency[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the character frequencies
        String[] frequencyData = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character frequencies:");
        for (String data : frequencyData) {
            if (data != null) {
                System.out.println(data);
            }
        }

        scanner.close();
    }
}
