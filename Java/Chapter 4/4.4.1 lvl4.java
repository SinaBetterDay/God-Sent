import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int numVal;
      int i;
      
      Scanner input = new Scanner(System.in);
      numVal = input.nextInt();
      
      for (i = numVal; i <= 0; i++) {
         System.out.print(i + " ");
      }
   }
}
