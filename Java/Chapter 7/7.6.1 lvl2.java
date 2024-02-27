/*Integer numElements is read from input, representing the size of array sequenceList. Perform the following tasks:

Read the element at index 0 of sequenceList from input.
Read the element at index 1 of sequenceList from input.
For each element from indices 2 to the end in sequenceList, assign the element with twice the sum of the two elements before that index.
Ex: If the input is:

5
14 6
then the output is:

Sequence: 14 6 40 92 264 */

import java.util.Scanner;

public class ArrayModification {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] sequenceList;
      int numElements;
      int i;
   
      numElements = scnr.nextInt();
   
      sequenceList = new int[numElements];

      sequenceList[0] = scnr.nextInt();
      sequenceList[1] = scnr.nextInt();
      
      for (i = 2; i < sequenceList.length; ++i) {
         sequenceList[i] = (sequenceList[i-1] + sequenceList[i-2]) *2;
      }

      System.out.print("Sequence: ");
      for (i = 0; i < sequenceList.length; ++i) {
         System.out.print(sequenceList[i] + " ");
      }
      System.out.println();
   }
}
