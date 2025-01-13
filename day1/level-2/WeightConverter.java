import java.util.Scanner;
public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Convert weight to kilograms
        double weightInKilograms = weightInPounds * 2.2;
        // Display the result
        System.out.printf("The weight of the person in pounds is %.2f and in kilograms is %.2f.%n", weightInPounds, weightInKilograms);
        scanner.close();
    }
}