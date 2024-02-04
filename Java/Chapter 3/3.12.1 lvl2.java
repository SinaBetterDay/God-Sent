import java.util.Scanner;

public class StringChecker {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inputString;

      inputString = scnr.nextLine();
      boolean hasDigit;
         
      if (Character.isDigit(inputString.charAt(0)) || Character.isDigit(inputString.charAt(1)) || Character.isDigit(inputString.charAt(2)))
      {
         hasDigit = true;
      }
      else
      {
         hasDigit = false;
      }

      if (hasDigit) {
         System.out.println("Valid string");
      }
      else {
         System.out.println("Invalid string");
      }
   }
}
