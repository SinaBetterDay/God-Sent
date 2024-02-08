import java.util.Scanner;

public class LoopCounter {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int firstNum;
      int secondNum;
      int count;
      int i;
      int j;
   
      firstNum = scnr.nextInt();
      secondNum = scnr.nextInt();
   
      count = 0;
      for (i = 0; i < firstNum; ++i) {
			for (j = 0; j < secondNum; j++) {
            ++count;
         }
      }

      System.out.println("Inner loop ran " + count + " times");
   }
}
