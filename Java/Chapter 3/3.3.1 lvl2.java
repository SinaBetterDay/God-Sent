import java.util.Scanner;

public class TaxRanges {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int incomeInput;

      incomeInput = scnr.nextInt();

      if (incomeInput < 46000 || incomeInput > 81000)
      {
         System.out.println("Different tax bracket");
      }
      else
      {
         System.out.println("31% tax bracket");
      }

   }
}
