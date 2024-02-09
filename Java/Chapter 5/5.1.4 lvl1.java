import java.util.Scanner;

public class NumberComputation {
   
   public static int computeNum(int val)
   {
      return val - 9;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputVal;
      int result;
      
      inputVal = scnr.nextInt();
      
      result = computeNum(inputVal);
      
      System.out.println(result);
   }
}
