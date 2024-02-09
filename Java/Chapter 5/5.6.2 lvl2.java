import java.util.Scanner;

public class ValuePrinter {

   public static void outputVal(int num1, int num2)
   {
      int sum = 1;
      if (num1 < 0)
      {
         for (int i=num1; i <= num2 && i < 0; i++)
         { 
            sum = sum * i;
         }
      }
      System.out.println(sum);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1;
   	int num2;

   	num1 = scnr.nextInt();
   	num2 = scnr.nextInt();
      outputVal(num1, num2);
   }
}
