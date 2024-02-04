import java.util.Scanner;

public class StringModification {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inString;

      inString = scnr.nextLine();
      boolean isValid;
      
      if (Character.isLowerCase(inString.charAt(0)) || Character.isLowerCase(inString.charAt(1)))
      {
         isValid = false;
      }
      else
      {
         isValid = true;
      }
      
      if (isValid) {
         System.out.println("String is valid");
      }
      else {
         System.out.println("String is not valid");
      }
   }
}
