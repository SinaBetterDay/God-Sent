/*Four strings are read from input and added to the tail of String Deque ticketLine. Remove and output three strings, matching the order of the first three lines of the example output. End each output with a newline.

Ex: If the input is Zoe Ana Tia Aya, then the output is:

Removed: Zoe
Removed: Aya
Removed: Ana
Remaining customer: Tia*/



import java.util.LinkedList;
import java.util.Deque;
import java.util.Scanner;

public class TicketLine {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Deque<String> ticketLine = new LinkedList<String>();
      int i;

      for (i = 0; i < 4; ++i) {
         ticketLine.addLast(scnr.next());
      }

      String removedHead = ticketLine.removeFirst();
      System.out.println("Removed: " + removedHead);

      String removedTail = ticketLine.removeLast();
      System.out.println("Removed: " + removedTail);

      String removedHeadAgain = ticketLine.removeFirst();
      System.out.println("Removed: " + removedHeadAgain);

      System.out.println("Remaining customer: " + ticketLine.peekFirst());
   }
}
