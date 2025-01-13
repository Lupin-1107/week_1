import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the student fee
        System.out.print("Enter the student fee (INR): ");
        double fee = input.nextDouble();

        // Take user input for the discount percentage
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate the final discounted fee
        double finalFee = fee - discount;

        // Display the discount amount and the final discounted fee
        System.out.println("The discount amount is INR " + discount + 
            " and final discounted fee is INR " + finalFee);
        input.close();                   
    }
}
