import java.util.Scanner;

public class MathFunctions {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double g;
      double h;
      double answer;

      g = scnr.nextDouble();
      h = scnr.nextDouble();

      answer = Math.sqrt(Math.pow(g, 3)/Math.abs(h));

      System.out.printf("%.1f\n", answer); // Outputs answer with 1 decimal place
   }
}
