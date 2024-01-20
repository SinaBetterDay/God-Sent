import java.util.Scanner;

public class ElectricResistance {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double electricVoltage;
      double electricCurrent;
      double electricResistance;
      
      electricVoltage = scnr.nextDouble();
      electricCurrent = scnr.nextDouble();
      
      electricResistance = electricVoltage / electricCurrent;
      
      System.out.print("Electric resistance is ");
      System.out.printf("%.4f\n", electricResistance);
   }
}
