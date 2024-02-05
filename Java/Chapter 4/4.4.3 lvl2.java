import java.util.Scanner;

public class IntegerInfo {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int valCount;
      boolean allValid = true; 
      valCount = scnr.nextInt();
      
      for (int i = 1; i <= valCount; i++) {
         int inputValue = scnr.nextInt();
      
         if (!(inputValue >= -1000 && inputValue <= -100)) {
            allValid = false;
         }
      }

      if (allValid) {
         System.out.println("All valid value(s)");
      }
      else {
         System.out.println("Invalid value(s)");   
      }
   }
}
