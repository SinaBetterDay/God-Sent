import java.util.Scanner;

public class Workplace {
   public static String[] removeFromWorkplace(String[] supplyList, int numLess) {
      int i;

      String[] resultArray = new String[supplyList.length - numLess];

      for (i = 0; i < resultArray.length; ++i) {
         resultArray[i] = supplyList[i];
      }

      return resultArray;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String[] usefulSupplies = new String[4];
      int input;
      int i;

      for (i = 0; i < usefulSupplies.length; ++i) {
         usefulSupplies[i] = scnr.next();
      }
        
      // Read number of values to decrease array size by
      input = scnr.nextInt();

      usefulSupplies = removeFromWorkplace(usefulSupplies, input);

      for (i = 0; i < usefulSupplies.length; ++i) {
         System.out.print(usefulSupplies[i] + " ");
      }
   }
}
