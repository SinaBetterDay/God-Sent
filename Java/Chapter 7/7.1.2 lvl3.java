/*Integer numElements is read from input and integer array applicantNumbers is declared with size numElements. Then, numElements integers are read from input and stored in applicantNumbers. For each element in applicantNumbers that is greater than or equal to 1, increment count.

Ex: If the input is

4
-4 9 1 1

then the output is:

Total: 3*/

import java.util.Scanner;

public class ApplicantInfo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numElements; 
      int i;
      
      numElements = scnr.nextInt();
      int[] applicantNumbers = new int[numElements];
      
		int count = 0;

		for (i = 0; i < applicantNumbers.length; ++i) {
			applicantNumbers[i] = scnr.nextInt();
		}

      for (i = 0; i < applicantNumbers.length; ++i) {
         if (applicantNumbers[i] >= 1) {
            count++;
         }
      }

		System.out.println("Total: " + count);
   }
}
