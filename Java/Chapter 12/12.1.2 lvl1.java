/*Integer numSize is read from input. ArrayList measurementValues contains numSize doubles read from input. Complete the enhanced for loop to output each value in measurementValues.

Ex: If the input is:

5
26.4 36.9 21.9 24.6 26.2
then the output is:

26.4 36.9 21.9 24.6 26.2 */

import java.util.Scanner;
import java.util.ArrayList;

public class Densitys {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Double> measurementValues = new ArrayList<Double>();
      int numSize;
      int i;

      numSize = scnr.nextInt();
      for (i = 0; i < numSize; ++i) {
         measurementValues.add(scnr.nextDouble());
      }
      
      for (double measurement1 : measurementValues) {
         System.out.print(measurement1 + " ");
      }
		System.out.println();
   }
}
