import java.util.Scanner;

public class PenDetails {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numberOfPens;

      numberOfPens = scnr.nextInt();

      if (numberOfPens > 12)
      {
         System.out.println("Enough pens");
      }
      else
      {
         System.out.println("Too few pens");
      }

   }
}
