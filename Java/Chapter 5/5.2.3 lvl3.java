import java.util.Scanner;

public class Result {

   public static void printResult(double in1, double in2)
   {
      System.out.print("Outcome: ");
      System.out.printf("%.1f", in1*in2);
      System.out.println();
   }

   public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
     double input1;
     double input2;

     input1 = scnr.nextDouble();
     input2 = scnr.nextDouble();

     printResult(input1, input2);
	}
}
