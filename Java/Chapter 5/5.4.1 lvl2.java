import java.util.Scanner;

public class MassConversion {

   public static double convertMass(int pound, int ounce)
   {
      double kilo;
      kilo = (ounce * 0.0283495) + ((pound * 16) * 0.0283495);
      return kilo;
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int pounds;
      int ounces;
    
      pounds = scan.nextInt();
      ounces = scan.nextInt();
      
      // Print with value rounded to 3 decimal places  
      System.out.printf("The number of kilograms is %.3f\n", convertMass(pounds, ounces));
   }
}
