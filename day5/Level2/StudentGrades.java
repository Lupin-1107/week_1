import java.util.Random;

public class StudentGrades {

    // Method to generate random marks for Physics, Chemistry, and Maths
    public static int[][] generateMarks(int n) {
        Random random = new Random();
        int[][] marks = new int[n][3];  // Array to hold marks for Physics, Chemistry, and Math for n students

        for (int i = 0; i < n; i++) {
            marks[i][0] = random.nextInt(101);  // Physics score between 0 and 100
            marks[i][1] = random.nextInt(101);  // Chemistry score between 0 and 100
            marks[i][2] = random.nextInt(101);  // Math score between 0 and 100
        }
        return marks;
    }

    // Method to calculate total, average, percentage for each student
    public static double[][] calculateResults(int[][] marks, int n) {
        double[][] results = new double[n][4];  // Array to hold total, average, percentage, and grade

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] results, int n) {
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i] = "Level4";
            } else if (percentage >= 70) {
                grades[i] = "Level3";
            } else if (percentage >= 60) {
                grades[i] = "Level2";
            } else if (percentage >= 50) {
                grades[i] = "Level1";
            } else if (percentage >= 40) {
                grades[i] = "Level1-";
            } else {
                grades[i] = "Remedial standards";
            }
        }
        return grades;
    }

    // Method to display the results in tabular form
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("%-12s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Student", "Physics", "Chemistry", "Maths", "Total", "Percentage", "Grade");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-12d%-10d%-10d%-10d%-10.2f%-10.2f%-10s\n",
                i + 1,            // Student Number
                scores[i][0],      // Physics Score
                scores[i][1],      // Chemistry Score
                scores[i][2],      // Maths Score
                results[i][0],     // Total
                results[i][2],     // Percentage
                grades[i]          // Grade
            );
        }
    }

    public static void main(String[] args) {
        int n = 10;  // Number of students
        int[][] marks = generateMarks(n);
        double[][] results = calculateResults(marks, n);
        String[] grades = calculateGrades(results, n);

        displayScorecard(marks, results, grades);  // Display the results in tabular format
    }
}
