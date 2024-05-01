/*Variable sandwichesDeque is declared as a deque of type String. Four strings are read from input. Assign sandwichesDeque with a LinkedList of type String. Add each string read from input to the tail of sandwichesDeque, in reverse order.

Ex: If the input is Swiss Lettuce Turkey Onions, then the output is:

Swiss completed
Lettuce completed
Turkey completed
Onions completed*/




import java.util.LinkedList;
import java.util.Deque;
import java.util.Scanner;

public class Sandwiches {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
		Deque<String> sandwichesDeque;
		String topping1;
		String topping2;
		String topping3;
		String topping4;
      int i;

		topping1 = scnr.next();
		topping2 = scnr.next();
		topping3 = scnr.next();
		topping4 = scnr.next();

      sandwichesDeque = new LinkedList<String>();
      sandwichesDeque.addFirst(topping4);
      sandwichesDeque.addFirst(topping3);
      sandwichesDeque.addFirst(topping2);
      sandwichesDeque.addFirst(topping1);

      // Print each element of the deque from the head
      for (i = 0; i < 4; ++i) {
         System.out.println(sandwichesDeque.removeFirst() + " completed");
		}
   }
}
