import java.util.Scanner;

public class VowelAndConsonantTypeChecker {

    // Method to check if the character is a vowel, consonant, or not a letter
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

    // Method to find vowels and consonants in a string and store in a 2D array
    public static String[][] findVowelsAndConsonants(String text) {
        int count = 0;
        
        // First, count how many valid characters are in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            String result = checkCharacter(currentChar);
            if (!result.equals("Not a Letter")) {
                count++;
            }
        }

        // Create a 2D array to store the characters and their types (Vowel, Consonant, Not a Letter)
        String[][] resultArray = new String[count][2];
        int index = 0;

        // Populate the 2D array with characters and their types
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            String result = checkCharacter(currentChar);
            if (!result.equals("Not a Letter")) {
                resultArray[index][0] = String.valueOf(currentChar);
                resultArray[index][1] = result;
                index++;
            }
        }

        return resultArray;
    }

    // Method to display the result in a simple format
    public static void displaySimpleResult(String[][] resultArray) {
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i][0] + " is a " + resultArray[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();

        // Call the method to find vowels and consonants
        String[][] result = findVowelsAndConsonants(inputText);

        // Call the method to display the result 
        displaySimpleResult(result);

        scanner.close();
    }
}
