import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int userNum;
      int i;
      
      Scanner input = new Scanner(System.in);
      userNum = input.nextInt();

      System.out.println("Ready!");
      
      for (i = userNum; i > 0; i--)
      {
         System.out.println(i);
      }
      System.out.println("Go!");

   }
}
