import java.util.Scanner;

public class HighestValues {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double inVal;
      double highestVal = 0.0;
      int i;
      
      highestVal = scnr.nextDouble();
      
      for (i = 2; i <= 5; i++) 
      {
         inVal = scnr.nextDouble();
         
         if (inVal > highestVal) {
            highestVal = inVal;
         }
     }
      System.out.println(highestVal);
   }
}
