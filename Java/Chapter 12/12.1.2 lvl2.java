/*Integer numSize is read from input. ArrayList numberValues contains numSize integers read from input. Complete the enhanced for loop to add all the elements less than 16 in numberValues to sumValues.

Ex: If the input is:

5
33 29 32 30 15
then the output is:

Sum of all values that are less than 16 is: 15*/


import java.util.Scanner;
import java.util.ArrayList;

public class Numbers {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> numberValues = new ArrayList<Integer>();
      int sumValues;
      int numSize;
      int i;
  
      numSize = scnr.nextInt();
      for (i = 0; i < numSize; ++i) {
         numberValues.add(scnr.nextInt());
      }
           
      sumValues = 0;
      for (Integer numberValue : numberValues) {

         if (numberValue < 16) {
            sumValues += numberValue;
         }

      }
      
      System.out.println("Sum of all values that are less than 16 is: " + sumValues);
   }
}
