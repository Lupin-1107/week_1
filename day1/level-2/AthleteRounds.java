import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user inputs for the sides of the triangle
        System.out.print("Enter the length of side 1 of the triangle in meters: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 of the triangle in meters: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 of the triangle in meters: ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Convert the target distance (5 km) to meters
        double targetDistance = 5000; // 5 km = 5000 meters

        // Calculate the number of rounds required to complete the 5 km run
        double rounds = targetDistance / perimeter;

        // Display the result
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km.%n", rounds);

        // Close the scanner
        scanner.close();
    }
}
