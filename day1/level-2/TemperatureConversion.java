import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Print the result
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
        input.close();
    }
}
