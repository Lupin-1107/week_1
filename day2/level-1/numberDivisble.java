import java.util.Scanner;

class NumberDivisible {
    public static void main(String[] args) {
        // Prompt the user for input
        System.out.println("Enter the value to check divisibility by 5:");

        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Read the input number
        int number = scanner.nextInt();

        // Check divisibility using the ternary operator
        String result = (number % 5 == 0) ? "Yes" : "No";

        // Display the result
        System.out.println("Is the number " + number + " divisible by 5? " + result);

        // Close the scanner to free resources
        scanner.close();
    }
}
