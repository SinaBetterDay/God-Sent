/*Integer numSize is read from input. ArrayList measurementValues contains numSize doubles read from input. Complete the enhanced for loop to add each element times 3.0 in valuesList to inflatedValuesList if the element is greater than 10.0.

Ex: If the input is:

6
3.7 78.5 4.1 50.4 50.8 9.0
then the output is:

Selected values after multiplying by 3.0:
235.5 151.2 152.4 */


import java.util.Scanner;
import java.util.ArrayList;

public class Densitys {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Double> measurementValues = new ArrayList<Double>();
      ArrayList<Double> inflatedValuesList = new ArrayList<Double>();
      int numSize;
      int i;
  
      numSize = scnr.nextInt();
      for (i = 0; i < numSize; ++i) {
         measurementValues.add(scnr.nextDouble());
      }
           
      for (Double currentMeasurement : measurementValues) {

         if (currentMeasurement > 10.0) {
            inflatedValuesList.add(currentMeasurement * 3.0);
         }

      }
      
      System.out.println("Selected values after multiplying by 3.0:");

      for (Double currentMeasurement : inflatedValuesList) {
         System.out.printf("%.1f ", currentMeasurement);
      }
		System.out.println();
   }
}
