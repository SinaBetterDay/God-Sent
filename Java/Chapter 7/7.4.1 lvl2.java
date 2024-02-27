/*Integer arrays values1 and values2 are read from input, and each store 4 elements. For each index from 0 to NUM_VALS, compare the element at the index in values1 with the element at the same index in values2. Store the smaller element in the array smallestValues.

Ex: If the input is:

48 44 31 15
43 33 22 39
then the output is:

43 33 22 15*/

import java.util.Scanner;

public class ValuesComparison {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 4;
      int[] values1 = new int[NUM_VALS];
      int[] values2 = new int[NUM_VALS];
		int[] smallestValues = new int[NUM_VALS];
      int i;

      for (i = 0; i < NUM_VALS; ++i) {
         values1[i] = scnr.nextInt();
      }

      for (i = 0; i < NUM_VALS; ++i) {
         values2[i] = scnr.nextInt();
      }

      for (i = 0; i < NUM_VALS; ++i) {
         if (values1[i] < values2[i]) {
            smallestValues[i] = values1[i];
         }
         else{
            smallestValues[i] = values2[i];
         }
      }

      for (i = 0; i < smallestValues.length; ++i) {
         System.out.print(smallestValues[i] + " ");
      }
      System.out.println();
   }
}
