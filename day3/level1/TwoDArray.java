import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int column = sc.nextInt();

        // Create a 2D array with the specified number of rows and columns
        int[][] Array = new int[row][column];

        // Populate the 2D array with user input values
        System.out.println("Enter the elements for the 2D array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                Array[i][j] = sc.nextInt(); // Inserting value into the 2D array
            }
        }

        // Create a 1D array to store the elements of the 2D array
        int[] OneDArray = new int[row * column];
        int index = 0;

        // Convert the 2D array to a 1D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                OneDArray[index] = Array[i][j]; // Assign the 2D element to the 1D array
                index++; // Increment the index for the 1D array
            }
        }

        // Display the elements of the 1D array
        System.out.println("The new 1D array values are:");
        for (int i = 0; i < OneDArray.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + OneDArray[i]); // Displaying each element of the 1D array
        }

        // Close the scanner to avoid resource leak
        sc.close();
    }
}
