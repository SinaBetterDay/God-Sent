/*Integer arrays originalArr and offsetArr are read from input, each containing four elements. Update each element in originalArr with originalArr's element plus the corresponding element in offsetArr.

Ex: If the input is:

10 60 15 40
20 50 30 35
then the output is:

30 110 45 75*/

import java.util.Scanner;

public class ComputeOffset {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 4;
		int[] originalArr = new int[NUM_VALS];
		int[] offsetArr = new int[NUM_VALS];
		int i;

		for (i = 0; i < NUM_VALS; ++i) {
			originalArr[i] = scnr.nextInt();
		}

		for (i = 0; i < NUM_VALS; ++i) {
			offsetArr[i] = scnr.nextInt();
		}

      for (i = 0; i < originalArr.length; ++i) {
         originalArr[i] += offsetArr[i];
      }

      for (i = 0; i < originalArr.length; ++i) {
			System.out.print(originalArr[i] + " ");
		}
		System.out.println();
   }
}
