import java.util.Scanner;

public class MultIfElse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numOunces;

      numOunces = scnr.nextInt();

      if (numOunces == 2)
      {
         System.out.println("Quarter cup");
      }
      else if (numOunces == 4)
      {
         System.out.println("Half cup");
      }
      else 
      {
         System.out.println("Another value");
      }

   }
}
