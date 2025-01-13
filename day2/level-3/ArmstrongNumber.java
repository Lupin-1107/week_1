import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        // Take the input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        // Copy the original number into another variable
        int originalNumber = number;

        // Initialize sum with value zero
        int sum = 0;

        // Call the find_digit function
        int digitCount = find_digit(number);

        // Logic to check Armstrong number
        while (originalNumber != 0) {
            // Get the last digit (remainder)
            int remainder = originalNumber % 10;
            
            // Add the digit raised to power of digit count
            sum += Math.pow(remainder, digitCount); 
            originalNumber /= 10; // Remove the last digit
        }

        // Check if the sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Closing the scanner
        scanner.close();
    }

    // Function to find the number of digits in the number
    static int find_digit(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
