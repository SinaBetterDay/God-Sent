import java.util.Scanner;

public class NumberConditions {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInput1;
      int userInput2;
      
      userInput1 = scnr.nextInt();
      userInput2 = scnr.nextInt();

      if (userInput1 <= 30)
      {
         System.out.println("userInput1 is less than or equal to 30.");
      }
      if (userInput2 >= 35)
      {
         userInput2 = 6;
      }
      else
      {
         System.out.println("userInput2 is less than 35.");
      }

      System.out.println("userInput2 is " + userInput2 + ".");
   }
}
