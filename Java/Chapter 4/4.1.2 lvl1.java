import java.util.Scanner;

public class InputReader {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int value;
   
      value = scnr.nextInt();
   
      while (value > 10) {
         System.out.println("Integer is " + value);
         value = scnr.nextInt();
      }
   
      System.out.println("Exit"); 
   }
}
