import java.util.Scanner;

public class DoubleConverter {
   public static void main(String args[]) {
      Scanner scnr = new Scanner(System.in);
      int numInches;
   
      numInches = scnr.nextInt();
      
      System.out.println((double)numInches);
   }
}
