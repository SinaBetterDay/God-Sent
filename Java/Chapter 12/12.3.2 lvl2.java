/*scoreGradeMap is a HashMap with Double key type and Character value type, representing the test score and grade of a student. Integer numData is read from input. Then numData key-value pairs are read from input and inserted into scoreGradeMap. For each value in the HashMap, output "-> " followed by the value and a newline.

Ex: If the input is:

2
43.5 F 78.5 C
then one possible output is:

All values found: 
-> F
-> C
Note: The order of the keys is not guaranteed in a HashMap.*/


import java.util.Scanner;
import java.util.HashMap;

public class ExamGrades {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      HashMap<Double, Character> scoreGradeMap = new HashMap<Double, Character>();
      double testScore;
      char equivGrade;
      int numData;
      int i;

      numData = scnr.nextInt();
      for (i = 0; i < numData; ++i) {
         testScore = scnr.nextDouble();
         equivGrade = scnr.next().charAt(0);
         scoreGradeMap.put(testScore, equivGrade);
      }

      System.out.println("All values found: ");

      for (Character grade : scoreGradeMap.values()) {
         System.out.println("-> " + grade);
      }

   }
}
