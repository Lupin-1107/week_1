
import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("The number " + number + " is not a positive integer.");
            scanner.close();
            return;
        }

        // Compute factorial using for loop
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print the factorial
        System.out.println("The factorial of " + number + " is: " + factorial);
        scanner.close();
    }
}
