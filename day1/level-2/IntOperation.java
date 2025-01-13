import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter the value for a: ");
        int a = input.nextInt();

        System.out.print("Enter the value for b: ");
        int b = input.nextInt();

        System.out.print("Enter the value for c: ");
        int c = input.nextInt();

        // Perform the integer operations considering operator precedence
        int result1 = a + b * c;        // First operation: a + (b * c)
        int result2 = a * b + c;        // Second operation: (a * b) + c
        int result3 = c + a / b;        // Third operation: c + (a / b)
        int result4 = a % b + c;        // Fourth operation: (a % b) + c

        // Print the results
        System.out.print("The results of Int Operations are ");
        System.out.print(result1);
        System.out.print(", " + result2);
        System.out.print(", " + result3);
        System.out.println(",and " + result4);
    }
}
