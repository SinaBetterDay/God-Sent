import java.util.Scanner;

public class CupsCount {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int orderedCups;
      
      orderedCups = scnr.nextInt();
   
      if (orderedCups >= 35 && orderedCups <= 65)
      {
         System.out.println("Standard carton");
      }
      else if (orderedCups > 115 && orderedCups <= 150)
      {
         System.out.println("Full carton");
      }
      else
      {
         System.out.println("Not efficient to ship");
      }
   }
}
