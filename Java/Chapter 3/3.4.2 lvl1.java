import java.util.Scanner;

public class PepperQuantity {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int pepperAmount;
      
      pepperAmount = scnr.nextInt();
   
      if (pepperAmount <= 10 || pepperAmount > 30)
      {
         System.out.println("Inadmissible batch");
      }
   }
}
