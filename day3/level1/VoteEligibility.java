import java.util.Scanner;

public class VoteEligibility {
	public static void main(String[] args) {

			Scanner input = new Scanner(System.in);

			// Create an array to store the ages of 10 students
			int[] ageArray = new int[10];

			// Loop to get the age input for 10 students
			for (int i = 0; i < ageArray.length; i++) {
					System.out.println("Enter the age of student " + (i + 1) + ":");
					ageArray[i] = input.nextInt();  // Take age input for each student
			}

			// Loop to check and print eligibility based on age
			for (int i = 0; i < ageArray.length; i++) {
					if (ageArray[i] < 0) {
							// Handle invalid age input
							System.out.println("Invalid age of student " + (i + 1));
					} else if (ageArray[i] >= 18) {
							// If age is 18 or more, the student can vote
							System.out.println("The student with the age " + ageArray[i] + " can vote");
					} else {
							// If age is less than 18, the student cannot vote
							System.out.println("The student with the age " + ageArray[i] + " cannot vote");
					}
			}

			// Close the scanner 
			input.close();
	}
}

