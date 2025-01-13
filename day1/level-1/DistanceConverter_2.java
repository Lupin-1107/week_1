import java.util.Scanner;

public class DistanceConverter_2 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        double km = scanner.nextDouble();

        // Conversion factor: 1 km = 1.6 miles
        double miles = km / 1.6;

        // Display the result
        System.out.println("The total miles is " + miles + " miles for the given " + km + " km");
        scanner.close();
    }
}
