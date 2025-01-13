import java.util.Scanner;

public class DistanceConverterYard {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Conversion factors
        double feetToYards = 1.0 / 3.0; // 1 yard = 3 feet
        double feetToMiles = 1.0 / (3.0 * 1760.0); // 1 mile = 1760 yards

        // Calculate distance in yards and miles
        double distanceInYards = distanceInFeet * feetToYards;
        double distanceInMiles = distanceInFeet * feetToMiles;

        // Display the results
        System.out.println("The distance in feet is: " + distanceInFeet);
        System.out.println("In yards: " + distanceInYards);
        System.out.println("In miles: " + distanceInMiles);
        input.close();
    }
}
