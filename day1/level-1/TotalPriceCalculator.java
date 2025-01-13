import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the unit price of the item
        System.out.print("Enter the unit price of the item (in INR): ");
        double unitPrice = input.nextDouble();

        // Prompt the user to enter the quantity to be bought
        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Display the results
        System.out.println("The total purchase price is INR " + totalPrice 
                           + " if the quantity is " + quantity 
            + " and the unit price is INR " + unitPrice);
        input.close();
        }
}
