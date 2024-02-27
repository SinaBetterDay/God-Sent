/*Integer arrays memberScores and memberAges are read from input. For each element in memberAges, if an element is greater than or equal to 30, output memberScores' corresponding element followed by a space. After the final output, end with a newline.

Ex: For the input:

65 22 12 85 54
20 10 42 25 39
then the output is:

12 54 */

import java.util.Scanner;

public class CombineArrays {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 5;
      int[] memberScores = new int[NUM_VALS];
      int[] memberAges = new int[NUM_VALS];
      int i; 

      for (i = 0; i < NUM_VALS; ++i) {
         memberScores[i] = scnr.nextInt();
      }

      for (i = 0; i < NUM_VALS; ++i) {
         memberAges[i] = scnr.nextInt();
      }

      for (i = 0; i < NUM_VALS; ++i) {
         if (memberAges[i] >= 30) {
            System.out.println(memberScores[i]);
         }
      }
   }
}
