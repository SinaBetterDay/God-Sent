import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int countNum;
      int i;
      
      Scanner input = new Scanner(System.in);
      countNum = input.nextInt();
      
      for (i = 1; i <= countNum; i++) {
         System.out.print(i + " ");
      }
   }
}
