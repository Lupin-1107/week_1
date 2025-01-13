import java.util.Scanner;

public class MultiplicationOptimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define an array to store the multiplication table
        int[] multiplication = new int[10];

        // Prompt the user to enter a number between 6 and 9
        System.out.println("Enter a Number between 6 and 9:");
        int number = sc.nextInt();

        // Check if the entered number is within the valid range (6 to 9)
        if (number >= 6 && number <= 9) {
            // Calculate the multiplication table and store the results in the array
            for (int i = 0; i < 10; i++) {
                multiplication[i] = (i + 1) * number;
            }

            // Print the multiplication table
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 0; i < 10; i++) {
                System.out.println(number + " * " + (i + 1) + " = " + multiplication[i]);
            }
        } else {
            // If the entered number is outside the range, print an error message
            System.out.println("Entered number is not in the range of 6 to 9.");
        }

        // Close the scanner
        sc.close();
    }
}
