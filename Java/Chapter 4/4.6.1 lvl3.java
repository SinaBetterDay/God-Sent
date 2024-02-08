import java.util.Scanner;

public class NestedLoops {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int initialNum;
		int finalNum;
      int i;
      int j;
   
      initialNum = scnr.nextInt();
		finalNum = scnr.nextInt();

      for (i = initialNum; i <= finalNum; i++) {
         for (j = 0; j < i; j++) {
             System.out.print("%");
         }
         System.out.println();
      }
   }
}
