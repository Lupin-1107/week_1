import java.util.Scanner;

public class PercentageCalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Creating a 2D array to store marks of students
        int[][] marks = new int[numStudents][3]; // 3 columns for physics, chemistry, and maths
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // Taking input for marks of students
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            // Physics Marks
            marks[i][0] = getValidMark(sc, "Physics");

            // Chemistry Marks
            marks[i][1] = getValidMark(sc, "Chemistry");

            // Maths Marks
            marks[i][2] = getValidMark(sc, "Maths");
        }

        // Calculating percentage and grade
        for (int i = 0; i < numStudents; i++) {
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Printing marks, percentages, and grades
        System.out.println("\nStudent Results: ");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);

            // Formatting the percentage to 2 decimal places
            System.out.printf("Percentage: %.2f\n", percentages[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }

        sc.close();
    }

    // Method to get a valid mark (between 0 and 100)
    private static int getValidMark(Scanner sc, String subject) {
        int mark;
        while (true) {
            System.out.print(subject + ": ");
            mark = sc.nextInt();
            if (mark >= 0 && mark <= 100) {
                break;
            } else {
                System.out.println("Invalid mark! Marks should be between 0 and 100. Please re-enter.");
            }
        }
        return mark;
    }
}
