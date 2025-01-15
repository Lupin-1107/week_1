import java.util.Random;

public class StudentVoting {

    // Method to generate random ages for students
    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        // Generate random 2-digit ages (between 10 and 99)
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + random.nextInt(90); // Generates a number between 10 and 99
        }

        return ages;
    }

    // Method to check if each student can vote based on their age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2]; // 2D array to store age and voting status

        for (int i = 0; i < ages.length; i++) {
            // Check if age is negative or valid
            if (ages[i] < 0) {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Invalid Age"; // Invalid age entry
            } else {
                result[i][0] = String.valueOf(ages[i]);
                // Check if age is 18 or above
                if (ages[i] >= 18) {
                    result[i][1] = "Can Vote";
                } else {
                    result[i][1] = "Cannot Vote";
                }
            }
        }

        return result;
    }

    // Method to display the result without tabular format
    public static void displayVotingStatus(String[][] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println("Age: " + result[i][0] + " -> " + result[i][1]);
        }
    }

    public static void main(String[] args) {
        // Number of students in the class
        int n = 10;

        // Generate random ages for the students
        int[] ages = generateRandomAges(n);

        // Check voting eligibility for each student
        String[][] result = checkVotingEligibility(ages);

        // Display the result without tabular format
        displayVotingStatus(result);
    }
}
