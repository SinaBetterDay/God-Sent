/*Given the integer array yearlyScores with the size of ARR_LENGTH, assign numMatches with the number of integers in userValues that are equal to 3.

Ex: If the input is 77 83 106 3 94 3, then the output is:

Number of 3s in array: 2*/


import java.util.Scanner;

public class ArrayComparison {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int ARR_LENGTH = 6;
      int[] yearlyScores = new int[ARR_LENGTH];
      int i;
      int numMatches;
      
      for (i = 0; i < yearlyScores.length; ++i) {
         yearlyScores[i] = scnr.nextInt();
      }

      numMatches = 0;
      
      for (i = 0; i < yearlyScores.length; ++i) {
         if (yearlyScores[i] == 3) {
            numMatches++;
         }
      }

      System.out.println("Number of 3s in array: " + numMatches);
   }
}
