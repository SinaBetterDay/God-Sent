import java.util.Scanner;

public class IfElse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int degreesCelsius;

      degreesCelsius = scnr.nextInt();

      if (degreesCelsius == 0)
      {
         System.out.println("Freezing point");
      }
      else
      {
         System.out.println("Not the freezing point");
      }

   }
}
