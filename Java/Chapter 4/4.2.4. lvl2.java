import java.util.Scanner;

public class NumCounts {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double dataValue;
		int numCounts;

		numCounts = 0;
      dataValue = scnr.nextFloat();
      
      while (dataValue > -5.0 && dataValue < 35.0)
      {
         numCounts++;
         dataValue = scnr.nextFloat();
      }
      numCounts++;
      System.out.println("Number of floating-point numbers read: " + numCounts);
   }
}
