import java.util.Scanner;

public class StringChecker {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userString;
   
      userString = scnr.nextLine();

      if (Character.isDigit(userString.charAt(2)))
      {
         System.out.println("The third character is digit: " + userString.charAt(2));
      }
      else
      {
         System.out.println("The third character is not a digit.");
      }
   }
}
