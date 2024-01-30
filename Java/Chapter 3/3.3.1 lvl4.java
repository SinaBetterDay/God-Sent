import java.util.Scanner;

public class CenturiesCategories {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputYear;

      inputYear = scnr.nextInt();

      if (inputYear >400 && inputYear <=500)
      {
         System.out.println("The 5th century");
      }
      else if (inputYear >500 && inputYear <=600)
      {
         System.out.println("The 6th century");
      }
      else if (inputYear >600 && inputYear <=700)
      {
         System.out.println("The 7th century");
      }
      else
      {
         System.out.println("Records not available for this input");
      }
   }
}
