import java.util.Scanner;

public class NumberCalculator {
   
   public static double calcNum(double num1, double num2)
   {
      double ans;
      ans = num1 - (7.5 * num2);
      return ans;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double numIn1;
      double numIn2;
      double result;
      
      numIn1 = scnr.nextDouble();
      numIn2 = scnr.nextDouble();
      
      result = calcNum(numIn1, numIn2);
      
      System.out.printf("%.2f", result);
   }
}
