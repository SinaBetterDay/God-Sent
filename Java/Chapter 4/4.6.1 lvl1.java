import java.util.Scanner;

public class LoopCounter {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      int endNum;
      int count;
      int i;
      int j;
   
      startNum = scnr.nextInt();
      endNum = scnr.nextInt();
   
      count = 0;
      i = 0;
      while (i <= startNum) {
			j = 0;
			while (j < endNum) {
            ++count;
            ++j;
         }
         ++i;
      }
   
      System.out.println("Inner loop ran " + count + " times");
   }
}
