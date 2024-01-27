import java.util.Scanner;

public class MultIfElse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int cardDeckSize;

      cardDeckSize = scnr.nextInt();

      if (cardDeckSize == 24)
      {
         System.out.println("Euchre");
      }
      else if (cardDeckSize == 36)
      {
         System.out.println("Short deck");
      }
      else if (cardDeckSize == 52)
      {
         System.out.println("Standard");
      }
      else 
      {
         System.out.println("Another deck size");
      }

   }
}
