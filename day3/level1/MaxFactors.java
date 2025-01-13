import java.util.Scanner;

public class MaxFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize the max number of factors
        int maxFactor = 10;
        
        // Create an array to store factors with initial size of maxFactor
        int[] factors = new int[maxFactor];
        int index = 0;

        // Take the user input for the number
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        // Loop through all numbers from 1 to the given number to find factors
        for (int i = 1; i <= number; i++) {
            // Check if the number is a factor of the given number
            if (number % i == 0) {
                // If the index exceeds maxFactor, double the size of the factors array
                if (index == maxFactor) {
                    maxFactor *= 2;  // Double the size of the array
                    int[] temp = new int[maxFactor]; // Create a temporary array with new size
                    // Copy old factors to the new temp array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; // Assign temp array back to factors
                }
                // Store the factor in the array
                factors[index++] = i;
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.println(factors[i]);
        }
        sc.close();
    }
}
