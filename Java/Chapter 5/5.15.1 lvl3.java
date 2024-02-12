import java.util.Scanner;

public class SportsEquipment {
   public static int[] stockEquipment(int[] stock) {
      int[] arr = new int[stock.length];
      
      for (int i=0; i < stock.length; i++)
      {
         arr[i] = stock[i] +4;
      }
      return arr;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] currentStock = new int[4];
      int[] arr;
      int i;

      for (i = 0; i < currentStock.length; ++i) {
         currentStock[i] = scnr.nextInt();
      }

      arr = stockEquipment(currentStock);

      for (i = 0; i < arr.length; ++i) {
         System.out.print(arr[i] + " ");
      }

      // Check if the array returned by stockEquipment() is a copy of currentStock
      if (arr == currentStock) {
         System.out.println("\nA new array was not returned.");
      }
   }
}
