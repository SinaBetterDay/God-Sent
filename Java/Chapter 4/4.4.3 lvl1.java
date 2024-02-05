import java.util.Scanner;

public class PositiveIntegers {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int valCount;
      boolean allPositive = true;
      valCount = scnr.nextInt();
      
      for (int i = 1; i <= valCount; i++) {
         int inputValue = scnr.nextInt();
      
         if (inputValue <= 0) {
             allPositive = false;
         }
      }

      if (allPositive) {
         System.out.println("All match");
      }
      else {
         System.out.println("Not all match");
      }
   }
}
