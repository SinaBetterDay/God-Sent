/*Given the integer array yearlyMiles with the size of NUM_VALUES, write a for loop to initialize the first half of yearlyMiles with the integers read from input, in reverse order.

Ex: If the input is 80 93 86 87 72, then the output is:

72 87 86 93 80 0 0 0 0 0 */

import java.util.Scanner;

public class MileList {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALUES = 10;
      int[] yearlyMiles = new int[NUM_VALUES];
      int i;
      
      for (i = 4; i >= 0; i--) {
         yearlyMiles[i] = scnr.nextInt(); 
      }
      
      for (i = 0; i < yearlyMiles.length; ++i) {
         System.out.print(yearlyMiles[i] + " ");
      }
      
      System.out.println();
   }
}
