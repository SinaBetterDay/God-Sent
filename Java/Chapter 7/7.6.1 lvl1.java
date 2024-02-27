/*Integer numBenefits is read from input, representing the number of integers to be read next. Then, the remaining integers are read and stored into array benefitsArray. For each element in benefitsArray that is less than 160:

Output the element, followed by " is corrected to the current value plus 60" and a newline.
Assign the element with the element's current value plus 60.
Ex: If the input is:

3
55 180 45
then the output is:

Raw benefits: 55 180 45 
55 is corrected to the current value plus 60
45 is corrected to the current value plus 60
Adjusted benefits: 115 180 105 */

import java.util.Scanner;

public class ArrayUpdate {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] benefitsArray;
      int numBenefits;
      int i;
   
      numBenefits = scnr.nextInt();
   
      benefitsArray = new int[numBenefits];
   
      for (i = 0; i < benefitsArray.length; ++i) {
         benefitsArray[i] = scnr.nextInt();
      }
   
      System.out.print("Raw benefits: ");
      for (i = 0; i < benefitsArray.length; ++i) {
         System.out.print(benefitsArray[i] + " ");
      }
      System.out.println();

      for (i = 0; i < benefitsArray.length; ++i) {
         if (benefitsArray[i] < 160) {
            System.out.println(benefitsArray[i] + " is corrected to the current value plus 60");
            benefitsArray[i] += 60;
         }
      }

      System.out.print("Adjusted benefits: ");
      for (i = 0; i < benefitsArray.length; ++i) {
         System.out.print(benefitsArray[i] + " ");
      }
      System.out.println();
   }
}
