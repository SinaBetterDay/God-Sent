import java.util.Scanner;
import java.util.ArrayList;

public class WidthListMultiples {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> widthList = new ArrayList<Integer>();
      int numWidths;
      int i;
      
      numWidths = scnr.nextInt();
      for (i = 0; i < numWidths; ++i) {
         widthList.add(scnr.nextInt());
      }

      for (i = 0; i < widthList.size(); i++) {
         if (widthList.get(i) %2 == 0) {
            System.out.print(widthList.get(i) + " ");
         }
      }
      System.out.println();
   }
}
