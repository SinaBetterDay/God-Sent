import java.util.Scanner;

public class HighestValueFinder {

   public static int findHighestValue(Scanner scnr)
   {
      int temp = 0;
      int max = 0;
      while (temp >= 0)
      {
         temp = scnr.nextInt();
         if (temp > max)
         {
            max = temp;
         }
      }
      return max;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int maxVal;
      
      maxVal = findHighestValue(scnr);
      
      System.out.println(maxVal);
   }
}
