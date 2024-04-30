/*Declare variable lengthList as a LinkedList of Integers. Read integer numLengths from input. Then, insert numLengths integers with values from 1 to numLengths into lengthList, in that order.

Ex: If the input is 5, then the output is:

1 2 3 4 5 
Note: Assume that numLengths is positive.*/


import java.util.Scanner;
import java.util.LinkedList;

public class MakeLengthList {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numLengths;
      int i;
      LinkedList<Integer> lengthList = new LinkedList<Integer>(); // Declare LinkedList of Integers

      numLengths = scnr.nextInt();

      for (i = 1; i <= numLengths; ++i) {
         lengthList.add(i);
      }


      // Traversing a list using indexes
      for (i = 0; i < lengthList.size(); ++i) {
         System.out.print(lengthList.get(i) + " ");
      }
      System.out.println();
   }
}
