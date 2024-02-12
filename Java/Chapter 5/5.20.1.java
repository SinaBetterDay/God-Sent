import java.util.Scanner;

public class LabProgram {
      public static int getMaxInt(int[] listInts, int listSize) {
         int max = listInts[0];

         for (int i = 1; i < listSize; i++) {
            if (listInts[i] > max) {
               max = listInts[i];
            }
         }

         return max;
      }

      public static void main(String[] args) {
         Scanner scnr = new Scanner(System.in);

         int listSize = scnr.nextInt();
         int[] listInts = new int[listSize];

         for (int i = 0; i < listSize; i++) {
            listInts[i] = scnr.nextInt();
         }

         int maxInt = getMaxInt(listInts, listSize);

         for (int i = 0; i < listSize; i++) {
            // Adjust the values by subtracting each value from the maximum
            int adjustedValue = maxInt - listInts[i];
            System.out.print(adjustedValue + " ");
         }
      System.out.println();
   }
}
