import java.util.Scanner;

public class SampleProgram_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for details of travel
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the city you are travelling from: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the city you are travelling to: ");
        String toCity = scanner.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();

        // Taking user inputs for distances in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();

        // Taking user inputs for time taken
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (in hours and minutes): ");
        int hoursFromToVia = scanner.nextInt();
        int minutesFromToVia = scanner.nextInt();

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (in hours and minutes): ");
        int hoursViaToFinalCity = scanner.nextInt();
        int minutesViaToFinalCity = scanner.nextInt();

        // Calculate total distance and total time
        double totalDistance = fromToVia + viaToFinalCity;
        int totalHours = hoursFromToVia + hoursViaToFinalCity;
        int totalMinutes = minutesFromToVia + minutesViaToFinalCity;

        // Adjust for minutes exceeding 60
        if (totalMinutes >= 60) {
            totalMinutes -= 60;
            totalHours += 1;
        }

        // Display the results
        System.out.println("\nTravel Details for " + name + ":");
        System.out.println("Total Distance from " + fromCity + " to " + toCity + " via " + viaCity + " is: " + totalDistance + " miles.");
        System.out.println("Total Time taken for the journey is: " + totalHours + " hours and " + totalMinutes + " minutes.");

        // Close the scanner
        scanner.close();
    }
}
