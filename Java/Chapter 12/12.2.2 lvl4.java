/*Four integers are read from input and inserted into lengthList. Complete the following tasks:

Assign listIterator with lengthList's ListIterator object.
Move listIterator between the elements at index 1 and index 2.
Use lengthList to insert value -1 at index 2.
Ex: If the input is 47 44 46 32, then the output is:

List contains: 47 44 -1 46 32
listIterator is between -1 and 46.*/


import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class LengthsList {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      LinkedList<Integer> lengthList = new LinkedList<Integer>();
      ListIterator<Integer> listIterator;
      int i;
      int nextIndex;
      int previousIndex;

      for (i = 0; i < 4; ++i) {
         lengthList.add(scnr.nextInt());
      }

      listIterator = lengthList.listIterator();
      
      for (i = 0; i < 2; ++i) {
         listIterator.next();
      }

      listIterator.add(-1);

      previousIndex = listIterator.previousIndex();
      nextIndex = listIterator.nextIndex();

      System.out.print("List contains:");
      listIterator = lengthList.listIterator();
      while (listIterator.hasNext()) {
         System.out.print(" " + listIterator.next());
      }
      System.out.println();
      if (nextIndex == lengthList.size()) {
         System.out.println("listIterator is at the end of the list.");
      }
      else {
         System.out.println("listIterator is between " + lengthList.get(previousIndex) + " and " + lengthList.get(nextIndex) + ".");
      }
   }
}
