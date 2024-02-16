import java.util.Scanner;
import java.util.ArrayList;

public class MakeWidthList {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startWidth;
		int endWidth;
      int i;
      ArrayList<Integer> widthList = new ArrayList<Integer>();
      
      startWidth = scnr.nextInt();
      endWidth = scnr.nextInt();
      
      for (i = startWidth; i <= endWidth; i++)
      {
         widthList.add(i);
      }
      
      // Traversing a list using indexes
      for (i = 0; i < widthList.size(); ++i) {
         System.out.print(widthList.get(i) + " ");
      }
      System.out.println();
   }
}
