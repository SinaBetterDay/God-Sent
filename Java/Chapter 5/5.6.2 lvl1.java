import java.util.Scanner;

public class ValuePrinter {

   public static void printVals(int in1, int in2)
   {
      for (int i = in1; i <= in2; i++)
      {
         System.out.println(i);
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int input1;
   	int input2;

   	input1 = scnr.nextInt();
   	input2 = scnr.nextInt();
      printVals(input1, input2);
   }
}
