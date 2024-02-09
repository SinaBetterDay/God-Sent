import java.util.Scanner;

public class CalcMiles {

   public static double mphAndMinutesToMiles(double miles, double mins)
   {
      double hours;
      hours = mins / 60;
      return hours * miles;
   }

   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      double milesPerHour;
      double minutesTraveled;

      milesPerHour = scnr.nextDouble();
      minutesTraveled = scnr.nextDouble();

      System.out.println("Miles: " + mphAndMinutesToMiles(milesPerHour, minutesTraveled));
   }
}
