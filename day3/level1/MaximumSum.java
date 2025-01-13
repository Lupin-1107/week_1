import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args) {
        // Create a variable to store an array of 10 elements of type double
        // and a variable to store the total of type double, initialized to 0.0.
        double[] Array = new double[10];
        double sum = 0.0;
        int index = 0;
        Scanner sc = new Scanner(System.in);

        // Use infinite while loop to get user input until stopping condition is met
        while (true) {
            // Take the user entry and check if the user entered 0 or a negative number to break the loop
            System.out.println("Enter the Element Value (0 or negative to stop):");
            double number = sc.nextDouble();

            // Break the loop if number is 0 or negative or if index reaches 10 (array size limit)
            if (number <= 0 || index == 10) {
                break;
            } else {
                // Assign the number to the array and increment the index value
                Array[index] = number;
                index++;
            }
        }

        // Calculate the sum of the numbers in the array
        for (int j = 0; j < index; j++) {
            sum += Array[j];
        }

        // Display the numbers entered and the sum
        System.out.println("Numbers entered:");
        for (int j = 0; j < index; j++) {
            System.out.println(Array[j]);
        }

        System.out.println("Sum of all entered numbers: " + sum);

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}
