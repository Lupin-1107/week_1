public class PenDistribution {
  public static void main(String[] args) {
      // Total number of pens and number of students
      int totalPens = 14;
      int totalStudents = 3;

      // Calculating the pens each student will get and the remaining pens
      int pensPerStudent = totalPens / totalStudents;  // Division to find the quantity of pens per student
      int remainingPens = totalPens % totalStudents;   // Modulus to find the remaining pens

      // Displaying the result
      System.out.println("The Pen Per Student is " + pensPerStudent + 
                         " and the remaining pen not distributed is " + remainingPens);
  }
}
