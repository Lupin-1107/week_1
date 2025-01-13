import java.util.Scanner;

class HarshadNumber {
    public static void main(String[] args) {
        // Create scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input from user for the number
        System.out.println("Enter the number to check if it's a Harshad Number:");
        int originalNumber = scanner.nextInt();

        // Initialize sum to store the sum of digits, and copy the original number
        int sum = 0, copiedNumber = originalNumber;

        // Logic to find the sum of digits
        while (originalNumber != 0) {
            int reminder = originalNumber % 10; // Find the remainder (digit)
            sum += reminder; // Add the digit to sum
            originalNumber /= 10; // Remove the last digit
        }

        // Check if the number is divisible by the sum of its digits
        if (copiedNumber % sum == 0) {
            System.out.println("Number " + copiedNumber + " is a Harshad Number.");
        } else {
            System.out.println("Number " + copiedNumber + " is not a Harshad Number.");
        }

        // Close the scanner
        scanner.close();
    }
}
