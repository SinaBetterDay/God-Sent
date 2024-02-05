import java.lang.Math;
import java.util.Scanner;
public class SensorThreshold {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double targetValue;
      double sensorReadingNumerator;
      double sensorReadingDenominator;
      double sensorReading;

      targetValue = scnr.nextDouble();
      sensorReadingNumerator = scnr.nextDouble();
      sensorReadingDenominator = scnr.nextDouble();

      sensorReading = sensorReadingNumerator / sensorReadingDenominator;

      if (Math.abs(sensorReading - targetValue) < 0.0001) {
         System.out.println("Equal");
      }
      else {
         System.out.println("Not equal");
      }
   }
}
