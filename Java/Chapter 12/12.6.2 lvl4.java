/*Integer numOrders is read from input, representing the number of integers that will be read from input. A for loop iterates numOrders times using loop variable i. In each iteration:

Read an integer from input.
If i is even, add the integer read to the head of orderNumbers.
Otherwise, add the integer read to the tail of orderNumbers.
Ex: If the input is:

4
127 113 97 50
then the output is:

97 127 113 50 */


import java.util.LinkedList;
import java.util.Deque;
import java.util.Scanner;

public class OrderNumbers {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Deque<Integer> orderNumbers;
		int numOrders;
      int i;

      orderNumbers = new LinkedList<Integer>();
      numOrders = scnr.nextInt();

		for (i = 0; i < numOrders; ++i) {

      	int num = scnr.nextInt();
         if (i % 2 == 0) {
            orderNumbers.addFirst(num);
         } else {
            orderNumbers.addLast(num);
         }

		}
      // Prints each element of the deque from the head
      for (i = 0; i < numOrders; ++i) {
         System.out.print(orderNumbers.removeFirst() + " ");
      }
      System.out.println();
   }
}
