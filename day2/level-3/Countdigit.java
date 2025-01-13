import java.util.Scanner; 
class Countdigit{
    public static void main(String[] args) {
        
    // Enter the Digit from User
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the Digit");
    int number = scanner.nextInt();
    
    // Copy the original number to use in the output and initialize count with 0
    int copiedNumber=number;
    int count = 0;

    // Logic to count digits 
    while (number != 0) {
        count++;
        number /= 10;
    }

    // printing result and closing the scanner
    System.out.println("Total digit in the "+copiedNumber+" "+"is"+ " "+count);
    scanner.close();
}
}