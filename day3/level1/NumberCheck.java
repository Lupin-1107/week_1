import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        // Create a scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // Define an array of 5 elements to store the numbers
        int[] numbers = new int[5];

        // Loop to take 5 numbers as input from the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Loop to check each number for positivity, negativity, or zero
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > 0) {
                // If the number is positive, check if it is even or odd
                if (num % 2 == 0) {
                    System.out.println("The number " + num + " is positive and even.");
                } else {
                    System.out.println("The number " + num + " is positive and odd.");
                }
            } else if (num < 0) {
                // If the number is negative
                System.out.println("The number " + num + " is negative.");
            } else {
                // If the number is zero
                System.out.println("The number " + num + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("The first and last elements are equal.");
        } else if (first > last) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        // Close the scanner object
        input.close();
    }
}
