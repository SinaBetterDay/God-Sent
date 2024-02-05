import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int firstNumber;
      int endNumber;
      int i;
      
      Scanner input = new Scanner(System.in);
      firstNumber = input.nextInt();
      endNumber = input.nextInt();
      
      for (i = firstNumber; i <= endNumber; i++) {
         System.out.print(i + " ");
      }
   }
}
