import java.util.Scanner;

public class ValueChecker {

   public static boolean checkValues(Scanner scnr)
   {
      int num = scnr.nextInt();
      while (num != -1)
      {
         if (num > 20 || num < 10)
         {
            return false;
         }
         num = scnr.nextInt();
      }
      return true;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      boolean allValid;
      
      allValid = checkValues(scnr);
      if (allValid) {
			System.out.println("All valid");
		}
		else {
			System.out.println("Has non-matching value(s)");
		}
   }
}
