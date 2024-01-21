import java.util.Scanner;
 
public class TimeConverter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int totalDays;
      int numYears;
      int numWeeks;
      int numDays;
 
      totalDays = scnr.nextInt();

      numYears = totalDays / 365;
      numDays = totalDays % 365;
      numWeeks = numDays / 7;
      numDays = numDays % 7;
     
      System.out.println("Years: " + numYears);
      System.out.println("Weeks: " + numWeeks);
      System.out.println("Days: " + numDays);
   }
}
