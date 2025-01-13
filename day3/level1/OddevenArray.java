import java.util.Scanner;

public class OddevenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking for user input
        System.out.println("Enter the number:");
        int number = sc.nextInt();

        // Check if the number is a natural number (greater than or equal to 1)
        if (number <= 0) {
            System.out.println(number + " is not a natural number");
            System.exit(0); // Exit the program if the number is not natural
        }

        // Calculate the size of the arrays (half of the number, plus one for odd and even numbers)
        int size = number / 2 + 1;

        // Declare the index variables for odd and even arrays
        int oddIndex = 0, evenIndex = 0;

        // Declare the odd and even arrays
        int[] oddArray = new int[size];
        int[] evenArray = new int[size];

        // Loop through the numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                oddArray[oddIndex++] = i;
            } else { // Else it's even
                evenArray[evenIndex++] = i;
            }
        }

        // Display the odd numbers
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.println(oddArray[i]);
        }

        // Display the even numbers
        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.println(evenArray[i]);
        }

        // Close the scanner to avoid resource leak
        sc.close();
    }
}
