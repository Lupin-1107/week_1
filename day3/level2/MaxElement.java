import java.util.Scanner;

class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = sc.nextInt();
        
        int maxDigit = 10;
        int[] array = new int[maxDigit];
        int index = 0;

        // Extract digits and store in array
        while (number != 0) {
            array[index] = number % 10;
            number /= 10;
            index++;
            if (index == maxDigit) {
                break;
            }
        }

        // Initialize largest and second largest to the minimum possible value
        int largest = -1;
        int secondLargest = -1;

        // Loop through the array to find largest and second largest
        for (int i = 0; i < index; i++) {
            if (array[i] > largest) {
                secondLargest = largest;  // Update second largest
                largest = array[i];       // Update largest
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];  // Update second largest if it's different from largest
            }
        }

        // Display results
        System.out.println("The largest element in the array: " + largest);
        System.out.println("The second largest element in the array: " + secondLargest);

        sc.close();
    }
}
