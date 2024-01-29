import java.util.Scanner;

public class Relational {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInput;
      
      userInput = scnr.nextInt();      
      
      if (userInput > -100) {
         System.out.println("More than -100");       
      }
      else {
         System.out.println("Fewer than or equal to -100");
      }
   }
}
