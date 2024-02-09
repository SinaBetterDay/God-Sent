import java.util.Scanner;

public class PriorityCalculator {

   public static int findPriority(int task)
   {
      if (task <= 20)
      {
         return 1;
      }
      else if (task > 20 && task < 95)
      {
         return 2;
      }
      else
      {
         return 3;
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int tasksNumber;

      tasksNumber = scnr.nextInt();
      
      System.out.println(findPriority(tasksNumber));
   }
}
