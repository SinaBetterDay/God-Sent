import java.util.Scanner;

public class CupsQuantity {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int cupsOrdered;
      
      cupsOrdered = scnr.nextInt();
      
      if (cupsOrdered >= 50 && cupsOrdered <= 80)
      {
         System.out.println("Large case");
      }
      if (cupsOrdered >= 130 && cupsOrdered <= 140)
      {
         System.out.println("Extra large case");
      }
   }
}
