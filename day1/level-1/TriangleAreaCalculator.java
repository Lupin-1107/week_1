import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the base and height in inches
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInches = input.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double heightInches = input.nextDouble();

        // Calculate the area in square inches
        double areaInSquareInches = 0.5 * baseInches * heightInches;

        // Convert the area to square centimeters (1 inch = 2.54 cm, so 1 square inch = 6.4516 cm²)
        double areaInSquareCentimeters = areaInSquareInches * 6.4516;

        // Display the results
        System.out.println("The area of the triangle is:");
        System.out.println("In square inches: " + areaInSquareInches);
        System.out.println("In square centimeters: " + areaInSquareCentimeters);
        input.close();
    }
}
