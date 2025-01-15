import java.util.Scanner;

public class SplitTextComparison {

    // Method to find the length of a string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            // Using an infinite loop to count characters until charAt() throws an exception
            while (true) {
                text.charAt(count); // Try accessing the character at the given index
                count++; // Increment the count for each character
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception will be thrown when the end of the string is reached
            return count; // Return the final count (length of the string)
        }
    }

    // Method to split text into words without using split() method
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 0;
        // Count words in the text
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; // Account for the last word
        
        // Create an array to store the start index of each word
        int[] spaceIndexes = new int[wordCount - 1];
        int wordIndex = 0;

        // Store the indexes of spaces separating words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[wordIndex++] = i;
            }
        }

        // Create an array to store the words
        String[] words = new String[wordCount];
        int startIndex = 0;

        // Extract the words using the space indexes
        for (int i = 0; i < wordCount; i++) {
            if (i < wordCount - 1) {
                words[i] = text.substring(startIndex, spaceIndexes[i]);
                startIndex = spaceIndexes[i] + 1;
            } else {
                words[i] = text.substring(startIndex);
            }
        }

        return words;
    }

    // Method to compare two string arrays and return a boolean result
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();

        // Call the user-defined customSplit() method
        String[] customSplitWords = customSplit(inputText);

        // Call the built-in split() method
        String[] splitWords = inputText.split(" ");

        // Compare the two arrays using compareArrays method
        boolean areArraysEqual = compareArrays(customSplitWords, splitWords);

        // Display the results
        System.out.println("Words using custom method:");
        for (String word : customSplitWords) {
            System.out.print(word + " ");
        }
        System.out.println();

        System.out.println("Words using built-in split() method:");
        for (String word : splitWords) {
            System.out.print(word + " ");
        }
        System.out.println();

        // Display if the arrays are equal
        if (areArraysEqual) {
            System.out.println("The words are identical in both methods.");
        } else {
            System.out.println("The words are different between the two methods.");
        }

        scanner.close();
    }
}
