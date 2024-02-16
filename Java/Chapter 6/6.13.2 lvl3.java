import java.util.Scanner;
import java.util.ArrayList;

public class LengthListModification {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> lengthList = new ArrayList<Integer>();
      int numLengths;
      int i;
      
      numLengths = scnr.nextInt();
      for (i = 0; i < numLengths; ++i) {
         lengthList.add(scnr.nextInt());
      }

      for (i = 0; i < numLengths; ++i) {
         if (i %2 == 0) {
            lengthList.set(i, -lengthList.get(i));
         }
      }

      for (i = 0; i < lengthList.size(); ++i) {
         System.out.print(lengthList.get(i) + " ");
      }
      System.out.println();
   }
}
