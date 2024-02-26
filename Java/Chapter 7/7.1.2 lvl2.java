/*Integer numElements is read from input and integer array userRating is declared with size numElements. Then, numElements integers are read from input and stored into userRating. If the first element is less than the last element, then assign Boolean firstSmaller with true. Otherwise, assign firstSmaller with false.

Ex: If the input is:

5
15 56 87 11 22

then the output is:

First element is less than last element*/

import java.util.Scanner;

public class RatingData {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numElements;
      int[] userRating;
      int i;
		boolean firstSmaller;

      numElements = scnr.nextInt();

      userRating = new int[numElements];
      for (i = 0; i < userRating.length; ++i) {
			userRating[i] = scnr.nextInt();
		}

      if (userRating[numElements-1] > userRating[0]) {
         firstSmaller = true;
      }
      else {
         firstSmaller = false;
      }

      if (firstSmaller) {
			System.out.println("First element is less than last element");
		}
		else {
			System.out.println("First element is not less than last element");
		}
   }
}
