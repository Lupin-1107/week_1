import java.util.Scanner; 

public class CheckNumber {
    public static void main(String[] args) {
        
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Asking the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  // Storing the input in the variable 'number'

        // Checking whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("positive");  // If number is greater than 0, it is positive
        } else if (number < 0) {
            System.out.println("negative");  // If number is less than 0, it is negative
        } else {
            System.out.println("zero");  // If number is 0, print zero
        }
        
        scanner.close();  // Closing the Scanner object to prevent memory leaks
    }
}
