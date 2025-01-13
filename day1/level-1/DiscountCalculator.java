public class DiscountCalculator {
  public static void main(String[] args) {
      // Given fee and discount percentage
      int fee = 125000;
      int discountPercent = 10;

      // Calculating the discount amount
      double discount = (fee * discountPercent) / 100.0;

      // Calculating the final discounted fee
      double finalFee = fee - discount;

      // Displaying the discount amount and the final fee
      System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
  }
}
