public class NullPointException {

   // Method to generate a NullPointerException
   public static void generateNullPointerException() {
       String text = null; // Initialize the variable to null

       // Attempt to call a method on the null variable, which generates NullPointerException
       System.out.println(text.length()); // This line will throw NullPointerException
   }

   // Method to demonstrate handling NullPointerException
   public static void handleNullPointerException() {
       String text = null; // Initialize the variable to null

       try {
           // Attempt to call a method on the null variable
           System.out.println(text.length()); // This line will throw NullPointerException
       } catch (NullPointerException e) {
           // Handle the exception
           System.out.println("Caught NullPointerException: The string is null and cannot be processed.");
       }
   }

   public static void main(String[] args) {
       try {
           generateNullPointerException(); // This will throw an exception
       } catch (NullPointerException e) {
           System.out.println("Exception caught in main: NullPointerException occurred.");
       }

       System.out.println("\nCalling method to handle NullPointerException:");
       handleNullPointerException(); // This method handles the exception internally
   }
}
