import java.util.Scanner;

public class DaysToWeeks {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double lengthDays;
      double lengthWeeks;
   
      lengthDays = scnr.nextDouble();
   
      lengthWeeks = lengthDays / 7;

      System.out.println("7 days = 1 week");
      System.out.printf("%.1f", lengthDays);
      System.out.print(" days = ");
      System.out.printf("%.5f", lengthWeeks);
      System.out.println(" weeks");

   }
}
