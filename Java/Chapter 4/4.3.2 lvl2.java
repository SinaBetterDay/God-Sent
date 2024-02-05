import java.util.Scanner;

public class SquareBrackets {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputCount;

      inputCount = scnr.nextInt();
      
      for (int i = 0; i >= 0 && i <= inputCount -1; i++)
      {
         int input = scnr.nextInt();
         System.out.print("[" + input + "]");
      }
      System.out.println();
   }
}
