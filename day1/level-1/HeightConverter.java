import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Convert cm to inches
        double heightInches = heightCm / 2.54;

        // Convert inches to feet and inches
        int feet = (int) (heightInches / 12);
        double remainingInches = heightInches % 12;

        // Display the result
        System.out.println("Your Height in cm is " + heightCm + 
                           " while in feet is " + feet + 
            " and inches is " + remainingInches);
        input.close();
        }
}
