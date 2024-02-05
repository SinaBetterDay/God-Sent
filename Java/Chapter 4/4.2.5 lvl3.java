import java.util.Scanner;

public class Sequencing {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int currentVal;
      int previousVal;
   
      previousVal = scnr.nextInt();
      currentVal = scnr.nextInt();
      System.out.println("Sequence starts at " + previousVal + ".");

      while (currentVal < previousVal)
      {
         System.out.println(currentVal + " is less than " + previousVal + ". Sequence is decreasing.");
         previousVal = currentVal;
         currentVal = scnr.nextInt();
      }
      System.out.println(currentVal + " breaks the sequence.");
   }
}
