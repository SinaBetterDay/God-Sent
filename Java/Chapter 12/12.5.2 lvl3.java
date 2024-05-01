/*Variable bacteriaColonysQueue is a Queue of type Integer. Integers are read from input and are added to bacteriaColonysQueue until -99 is read. While bacteriaColonysQueue is not empty and the element at the head of bacteriaColonysQueue is greater than or equal to 12, repeat the following:

Remove the element at the head of bacteriaColonysQueue.
Output the element followed by " CFU/ml, colony continues to shrink", and insert the element, divided by 2, to the tail of bacteriaColonysQueue.
End each output with a newline.

Ex: If the input is 256 -99, then the output is:

256 CFU/ml, colony continues to shrink
128 CFU/ml, colony continues to shrink
64 CFU/ml, colony continues to shrink
32 CFU/ml, colony continues to shrink
16 CFU/ml, colony continues to shrink
Remaining amount(s) in queue: 1
First colony size that is 12 or less: 8*/


import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class DecayModelingWithQueue {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Queue<Integer> bacteriaColonysQueue = new LinkedList<Integer>();
      int bacteriaColonyValue;
  
      bacteriaColonyValue = scnr.nextInt();
      while (bacteriaColonyValue != -99) {
         bacteriaColonysQueue.add(bacteriaColonyValue);
         bacteriaColonyValue = scnr.nextInt();
      }
      
      while (bacteriaColonysQueue.peek() != null && bacteriaColonysQueue.peek() >= 12) {

      	int colonySize = bacteriaColonysQueue.remove();
         System.out.println(colonySize + " CFU/ml, colony continues to shrink");
         int newColonySize = colonySize / 2;
         bacteriaColonysQueue.add(newColonySize);

		}

		System.out.println("Remaining amount(s) in queue: " + bacteriaColonysQueue.size());
		if (bacteriaColonysQueue.peek() != null) {
			System.out.println("First colony size that is 12 or less: " + bacteriaColonysQueue.peek());
		}
   }
}
