import java.util.Scanner;  
class SmallestOfThreeNumbers {   
    
    public static void main(String[] args) {
        
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Asking the user to input  numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt(); 
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Initializing the result string to "Yes"
        String result = "Yes"; 

        // Checking if the first number is the smallest
        if (number1 < number2 && number1 < number3) {
            result = "Yes"; // The first number is the smallest
        } else {
            result = "No";  // The first number is not the smallest
        } 
        
        // Printing whether the first number is the smallest or not
        System.out.println("Is the first number the smallest? " + result);
        scanner.close();
    }
}

