/*Declare variable scoreAndGrade as a HashMap with Character key type and Double value type, representing a grade and the minimum score of the grade. Read integer dataCount from input. Then read dataCount key-value pairs from input and insert each into scoreAndGrade. If the key already exists, do not replace the key's existing value with the new value.

Ex: If the input is:

4
F 56.5 D 60.5 C 70.5 C 69.0
then one possible output is:

Key: C, Value: 70.5
Key: D, Value: 60.5
Key: F, Value: 56.5
Note: The order of the keys is not guaranteed in a HashMap.*/


import java.util.Scanner;
import java.util.HashMap;

public class ExamGrades {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char letterGrade;
      double minimumScore;
      int dataCount;
      int i;
      HashMap<Character, Double> scoreAndGrade = new HashMap<Character, Double>(); 



      dataCount = scnr.nextInt();

      for ( i = 0; i < dataCount; ++i) {
         letterGrade = scnr.next().charAt(0);
         minimumScore = scnr.nextDouble();
                 
                 if (!scoreAndGrade.containsKey(letterGrade)) {
            scoreAndGrade.put(letterGrade, minimumScore);
         }
      }

      // For each key in the HashMap, retrieve the value associated with the key
      for (Character key : scoreAndGrade.keySet()) {
         System.out.println("Key: " + key + ", Value: " + scoreAndGrade.get(key));
      }
   }
}
