import java.util.Scanner;

public class PrismCalculations {

   public static double computeBaseArea(double length, double width)
   {
      return length * width;
   }
   
   public static double computeVol(double length, double width, double height)
   {
      return length * width * height;
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      double baseLength;
		double baseWidth;
		double height;
      
      baseLength = scan.nextDouble();
		baseWidth = scan.nextDouble();
		height = scan.nextDouble();
      
      System.out.println("Base length: " + baseLength);
		System.out.println("Base width: " + baseWidth);
		System.out.println("Height: " + height);
      System.out.printf("Base area: %.1f\n", computeBaseArea(baseLength, baseWidth));
      System.out.printf("Volume: ");
      System.out.printf("%.1f\n", computeVol(baseLength, baseWidth, height));
   }
}
