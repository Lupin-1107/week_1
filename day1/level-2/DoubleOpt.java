import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter the value for a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value for c: ");
        double c = input.nextDouble();

        // Perform the double operations considering operator precedence
        double result1 = a + b * c;        // First operation: a + (b * c)
        double result2 = a * b + c;        // Second operation: (a * b) + c
        double result3 = c + a / b;        // Third operation: c + (a / b)
        double result4 = a % b + c;        // Fourth operation: (a % b) + c

        // Print the results
        System.out.print("The results of Double Operations are ");
        System.out.print(result1);
        System.out.print(", " + result2);
        System.out.print(", " + result3);
        System.out.println(", and " + result4);
        input.close();
    }
}
