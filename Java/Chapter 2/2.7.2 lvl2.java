import java.util.Scanner;

public class DaysConverter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int DAYS_PER_WEEK = 7;
      int numWeeks;
      double numDays;
   
      numWeeks = scnr.nextInt();
   
      numDays = (double) numWeeks* DAYS_PER_WEEK;
   
      System.out.print(numDays);
      System.out.println(" days");
   }
}
