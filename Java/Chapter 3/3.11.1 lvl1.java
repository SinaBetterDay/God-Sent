import java.util.Scanner;

public class CharMatching {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userInput;

      userInput = scnr.nextLine();

      if (userInput.charAt(2) == 'r')
      {
         System.out.println("Found match");
      }
      else
      {
         System.out.println("No match");
      }
   }
}
