import java.util.Scanner;

public class VolumeConversion {
   public static double millilitersToFluidOunces(int userMilliliters) {
      double ounces;
      ounces = userMilliliters * 0.033814;
      return ounces;
   }
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int numMilliliters;
    
      numMilliliters = scan.nextInt();
      
      // Print with value rounded to 3 decimal places  
      System.out.printf("Fluid ounces: %.3f\n", millilitersToFluidOunces(numMilliliters));
   }
}
