public class AverageMark {
  public static void main(String[] args) {
      // Marks in Maths, Physics, and Chemistry
      int mathsMark = 94;
      int physicsMark = 95;
      int chemistryMark = 96;
      
      // Calculating the average marks
      int totalMarks = mathsMark + physicsMark + chemistryMark;
      double averageMarks = totalMarks / 3.0;  // Divide by 3.0 to get a float value

      // Printing the average marks
      System.out.println("Sam's average mark in PCM is " + averageMarks);
  }
}
