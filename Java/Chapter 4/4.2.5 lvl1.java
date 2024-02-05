import java.util.Scanner;

public class SimpleWhileLoop {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
		int currDisplacement;
		int numSuccesses;

		numSuccesses = 0;

      while (numSuccesses !=4)
      {
         currDisplacement = scnr.nextInt();
         if (currDisplacement > 0)
         {
            numSuccesses++;
            System.out.println(currDisplacement);
         }
      }
   }
}
