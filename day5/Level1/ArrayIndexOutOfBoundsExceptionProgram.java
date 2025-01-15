import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionProgram {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        // Attempt to access an index larger than the length of the array
        System.out.println("Accessing out-of-bounds element: " + names[names.length]); // This line will throw ArrayIndexOutOfBoundsException
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            // Attempt to access an index larger than the length of the array
            System.out.println("Accessing out-of-bounds element: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the specific ArrayIndexOutOfBoundsException
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index out of bounds for the array.");
        } catch (RuntimeException e) {
            // Handle any other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for array size
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create an array and take user input for names
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.println("\nCalling method to generate ArrayIndexOutOfBoundsException:");
        try {
            generateArrayIndexOutOfBoundsException(names); // This will throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: ArrayIndexOutOfBoundsException occurred.");
        }

        handleArrayIndexOutOfBoundsException(names); // This method handles the exception internally

        scanner.close();
    }
}
