import java.util.Scanner;

public class FluidOuncesToCups {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      // Modify the following code
      double volOz;
      double volCups;
   
      volOz = scnr.nextDouble();
   
      volCups = volOz / 8;
   
      System.out.printf("%.3f cups\n", volCups);
   }
}
