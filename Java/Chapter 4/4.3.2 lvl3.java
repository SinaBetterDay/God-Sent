import java.util.Scanner;

public class CommaSeparatedValues {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inCount;

      inCount = scnr.nextInt();
      
      for (int i = 0; i >= 0 && i <= inCount -1; i++)
      {
         int input = scnr.nextInt();
         System.out.print(input);
         if (i <= inCount -2)
         {
            System.out.print(",");
         }
      }
      System.out.println();
   }
}
