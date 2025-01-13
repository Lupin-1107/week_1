import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number > 0) {
            // Create a String array to store the results
            String[] resultArray = new String[number];

            // Loop from 1 to the given number (inclusive)
            for (int i = 1; i <= number; i++) {
                // Check for multiples of both 3 and 5 (FizzBuzz)
                if (i % 3 == 0 && i % 5 == 0) {
                    resultArray[i - 1] = "FizzBuzz";
                }
                // Check for multiples of 3 (Fizz)
                else if (i % 3 == 0) {
                    resultArray[i - 1] = "Fizz";
                }
                // Check for multiples of 5 (Buzz)
                else if (i % 5 == 0) {
                    resultArray[i - 1] = "Buzz";
                }
                // If none of the above, store the number itself
                else {
                    resultArray[i - 1] = Integer.toString(i);
                }
            }

            // Loop through the resultArray and print the results with the index position
            for (int i = 0; i < resultArray.length; i++) {
                System.out.println("Position " + (i + 1) + " = " + resultArray[i]);
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close the scanner 
        sc.close();
    }
}
