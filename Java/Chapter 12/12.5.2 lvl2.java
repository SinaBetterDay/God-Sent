/*Variable heightsQueue is a Queue of type Integer. heightFound is assigned with -1. Integers are read from input and are added to heightsQueue until -99 is read. While heightsQueue is not empty, repeat the following:

Remove and output the element at the head of heightsQueue.
If the removed element is greater than or equal to 37 and heightFound is -1, assign heightFound with the element.
End each output with a newline.

Ex: If the input is 35 47 42 -99, then the output is:

35
47
42
Queue is empty
The first element greater than or equal to 37 is 47*/


import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class HeightsQueueTraversal {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Queue<Integer> heightsQueue = new LinkedList<Integer>();
      int heightValue;
		int heightFound = -1;
		int headValue;

      heightValue = scnr.nextInt();
      while (heightValue != -99) {
         heightsQueue.add(heightValue);
         heightValue = scnr.nextInt();
      }
      while (heightsQueue.peek() != null) {

			headValue = heightsQueue.remove();
         System.out.println(headValue);
         if (headValue >= 37 && heightFound == -1) {
            heightFound = headValue;
         }

		}

		System.out.println("Queue is empty");

		if (heightFound != -1) {
			System.out.println("The first element greater than or equal to 37 is " + heightFound);
      }
   }
}
