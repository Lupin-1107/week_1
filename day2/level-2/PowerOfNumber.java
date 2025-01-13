import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the base
        System.out.println("Enter the base : ");
        int number = scanner.nextInt();
        //Input the exponent
        System.out.println("Enter the power : ");
        int power = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(number + " raised to the power " + power + " is: " + result);
        scanner.close();
    }
}
