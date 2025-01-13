import java.util.Scanner;

public class TotalIncomeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the salary
        System.out.print("Enter your salary in INR: ");
        double salary = scanner.nextDouble();

        // Prompt the user to enter the bonus
        System.out.print("Enter your bonus in INR: ");
        double bonus = scanner.nextDouble();

        // Calculate the total income
        double totalIncome = salary + bonus;

        // Print the result
        System.out.printf("The salary is INR %.2f and bonus is INR %.2f. Hence Total Income is INR %.2f.%n", 
                          salary, bonus, totalIncome);

        // Close the scanner
        scanner.close();
    }
}
