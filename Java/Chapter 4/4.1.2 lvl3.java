import java.util.Scanner;

public class ResultCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInput;
      int finalNum;
   
      finalNum = 0;
      userInput = scnr.nextInt();

      while (userInput >= 0)
      {
         if (userInput % 5 != 0)
         {
            System.out.println("miss");
         }
         else
         {
            finalNum += 1;
            System.out.println("hit");
         }
      userInput = scnr.nextInt();
      }

      System.out.println("Final number is " + finalNum);
   }
}
