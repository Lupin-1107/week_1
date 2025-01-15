import java.util.Scanner;

public class ShortestAndLongestString {

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

    // Method to split the text into words without using split() method
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
        int spaceIndex = 0;
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
        int wordStart = 0;

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

    // Method to create a 2D array with words and their corresponding lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Word
            result[i][1] = String.valueOf(findLength(words[i])); // Length of the word
        }
        
        return result;
    }

    // Method to find the shortest and longest words based on the 2D array of words and lengths
    public static String[] findShortestAndLongest(String[][] wordsWithLengths) {
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];
        
        for (int i = 1; i < wordsWithLengths.length; i++) {
            int currentLength = Integer.parseInt(wordsWithLengths[i][1]);
            int shortestLength = Integer.parseInt(wordsWithLengths[findLength(shortest)][1]);
            int longestLength = Integer.parseInt(wordsWithLengths[findLength(longest)][1]);
            
            if (currentLength < shortestLength) {
                shortest = wordsWithLengths[i][0];
            }
            if (currentLength > longestLength) {
                longest = wordsWithLengths[i][0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();

        // Call the user-defined customSplit() method to get the words
        String[] words = customSplit(inputText);

        // Call the getWordsWithLengths() method to get the 2D array of words and lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Call the findShortestAndLongest() method to get the shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);

        // Display the result
        System.out.println("Shortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);

        scanner.close();
    }
}
