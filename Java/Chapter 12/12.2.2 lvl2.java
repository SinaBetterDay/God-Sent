/*Integer numWeights is read from input. Then, numWeights integers are read from input and inserted into weightList. Use the common LinkedList methods to remove the first element that is divisible by 4 in weightList.

Ex: If the input is:

8
39 16 30 23 8 45 20 12
then the output is:

39 30 23 8 45 20 12 
Note: Variable found is initialized to -1 and represents the target element not existing in the list. When the element appears, assign found with the index of the element.*/


import java.util.Scanner;
import java.util.LinkedList;

public class WeightList {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      LinkedList<Integer> weightList = new LinkedList<Integer>();
      int numWeights;
		int i;
		int found = -1;

      numWeights = scnr.nextInt();

      for (i = 0; i < numWeights; ++i) {
         weightList.add(scnr.nextInt());
      }

      for (i = 0; i < weightList.size(); ++i) {
         if (weightList.get(i) % 4 == 0) {
            found = i;
            break;
         }
      }

      // If an element divisible by 4 is found, remove it
      if (found != -1) {
         weightList.remove(found);
      }
		// Traversing a list using indexes
		for (i = 0; i < weightList.size(); ++i) {
			System.out.print(weightList.get(i) + " ");
		}
      System.out.println();
   }
}
