/*Given the integer array dailyMiles with the size of ARR_VALS, write a for loop to output the integers in the first half of dailyMiles in reverse order. Separate the integers with a comma followed by a space (", ").

Ex: If the input is 32 68 70 103 51 86 73 41 119 88, then the output is:

51, 103, 70, 68, 32*/

import java.util.Scanner;

public class MileRecord {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int ARR_VALS = 10;
      int[] dailyMiles = new int[ARR_VALS];
      int i;
      
      for (i = 0; i < dailyMiles.length; ++i) {
         dailyMiles[i] = scnr.nextInt();
      }
      
      for (i = (dailyMiles.length/2)-1; i >= 0; i--) {
         System.out.print(dailyMiles[i]);
         if (i > 0)
         {
            System.out.print(", ");
         }
      }
      
      System.out.println();
   }
}
