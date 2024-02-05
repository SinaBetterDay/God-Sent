import java.util.Scanner;

public class NumberOfApples {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numInts;
      int value;
      int i;

      numInts = scnr.nextInt();
      
      for (i = 0; i >= 0 && i <= numInts -1; i++)
      {         
         value = scnr.nextInt();
         System.out.println(value + " apples");
      }

   }
}
