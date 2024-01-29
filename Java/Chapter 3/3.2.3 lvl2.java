import java.util.Scanner;

public class Relational {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInput;
   
      userInput = scnr.nextInt(); 
   
      if (userInput >= 89)
      {
         System.out.println("Greater than or equal to 89");
      }
      else
      {
         System.out.println("Less than 89");
      }

   }
}
