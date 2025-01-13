import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store multiplication values (1 to 10)
        int[] multiplication = new int[11]; // Array to store results

        // Prompt the user to enter a number for the multiplication table
        System.out.println("Enter the number for the table:");
        int number = sc.nextInt(); // User input for the number

        // Loop to calculate the multiplication table
        for (int i = 1; i <= 10; i++) {
            multiplication[i] = number * i; // Store the multiplication result in the array
        }

        // Loop to display the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println("The table value of " + number + " * " + i + " is " + multiplication[i]);
        }

        // Close the scanner
        sc.close();
    }
}
