import java.util.Scanner;

public class TemperatureConversion_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Print the result
        System.out.printf("The %.2f Fahrenheit is %.2f Celsius.%n", fahrenheit, celsiusResult);

        // Close the scanner
        scanner.close();
    }
}
