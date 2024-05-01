/*Integer numOrders is read from input, representing the number of integers to be added to the deque of type Integer, orderNumbers. Complete the while loop to output all elements starting from the tail of orderNumbers.

Ex: If the input is:

3
127 73 32
then the output is:

Completed: 32
Completed: 73
Completed: 127
Note: Both peekFirst() and peekLast() return, but do not remove, the element at the respective location of the deque. */




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
         orderNumbers.addLast(scnr.nextInt());
      }

      while (!orderNumbers.isEmpty()) {   
         System.out.println("Completed: " + orderNumbers.removeLast());
      }
   }
}
