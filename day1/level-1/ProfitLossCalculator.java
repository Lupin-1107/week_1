public class ProfitLossCalculator {
  public static void main(String[] args) {
      // Given cost price and selling price
      int costPrice = 129;
      int sellingPrice = 191;
      
      // Calculating profit and profit percentage
      int profit = sellingPrice - costPrice;
      double profitPercentage = (double) profit / costPrice * 100;
      
      // Displaying the results using a single print statement
      System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
                         "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
  }
}
