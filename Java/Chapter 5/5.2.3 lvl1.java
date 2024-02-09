import java.util.Scanner;

public class AirportInfo {

   public static void printAirportInfo(String code, String name)
   {
      System.out.println(code + " is " + name + "'s airport code.");
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String airportCode;
      String airportName;

      airportCode = scnr.next();
      airportName = scnr.next();

      printAirportInfo(airportCode, airportName);
   }
}
