/*Integer numLengths is read from input. Then, numLengths integers are read from input and inserted into lengthList. Complete the while loop to subtract 5 from every element in lengthList using lengthList's ListIterator.

Ex: If the input is:

4
44 33 18 24
then the output is:

39 28 13 19 */


import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class LengthList {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      LinkedList<Integer> lengthList = new LinkedList<Integer>();
      ListIterator<Integer> listIterator;
      int numLengths;
      int lengthValue;
      int i;

      numLengths = scnr.nextInt();
      for (i = 0; i < numLengths; ++i) {
         lengthList.add(scnr.nextInt());
      }

      listIterator = lengthList.listIterator();
      while (listIterator.hasNext()) {
         lengthValue = listIterator.next();
         listIterator.set(lengthValue - 5);

      }
      
		listIterator = lengthList.listIterator();
		while (listIterator.hasNext()) {
			lengthValue = listIterator.next();
			System.out.print(lengthValue + " ");
		}
		System.out.println();
   }
}
