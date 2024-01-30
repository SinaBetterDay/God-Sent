import java.util.Scanner;

public class TemperatureController {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double temperatureInFahrenheit;
      
      temperatureInFahrenheit = scnr.nextDouble();

      if (temperatureInFahrenheit < 30.5 || temperatureInFahrenheit > 90.5)
      {
         System.out.println("Decline");
      }
      else
      {
         System.out.println("Approve");
      }
   }
}
