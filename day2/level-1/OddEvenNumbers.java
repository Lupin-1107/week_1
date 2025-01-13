import java.util.Scanner;
public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is natural
        if (number < 1) {
            System.out.println("The number " + number + " is not a natural number.");
            scanner.close();
            return;
        }

        // Iterate and print odd/even
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number.");
            } else {
                System.out.println(i + " is an odd number.");
            }
            scanner.close();
        }
    }
}
