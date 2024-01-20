import java.util.Scanner;

public class MathFunctions {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double p;
      double q;
      double answer;

      p = scnr.nextDouble();
      q = scnr.nextDouble();

      answer = Math.pow(Math.sqrt(p-q), 3);

      System.out.printf("%.2f\n", answer); // Outputs answer with 2 decimal places
   }
}
