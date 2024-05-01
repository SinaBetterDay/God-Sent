/*Variable uniqueWeights is declared as a HashSet. Then, integer numElements is read from input representing the number of integers to be read next. For each integer read into variable weight:

Add weight to uniqueWeights.
If weight is successfully added, output "Weight added: ", followed by weight.
Otherwise, output "Duplicate entered: ", followed by weight, and assign duplicateEncountered with true.
End each output with a newline.

Ex: If the input is:

3
35 35 47
then the output is:

Weight added: 35
Duplicate entered: 35*/

import java.util.HashSet;
import java.util.Scanner;

public class Weights {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      HashSet<Integer> uniqueWeights = new HashSet<Integer>();
      int numElements;
      int weight;
		boolean duplicateEncountered;
		int i;
      
      numElements = scnr.nextInt();
		duplicateEncountered = false;
      
      for (i = 0; i < numElements; ++i) {
			if (!duplicateEncountered) {
         	weight = scnr.nextInt();

         	if (uniqueWeights.add(weight)) {
               System.out.println("Weight added: " + weight);
            } else {
               System.out.println("Duplicate entered: " + weight);
               duplicateEncountered = true;
            }

      	}
		}
   }
}
