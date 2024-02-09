import java.util.Scanner;

public class EmployeeFinder {

   public static int findResources(int priority, int tasks)
   {
      if (priority == 1)
      {
         if (tasks < 35)
         {
            return 60;
         }
         if (tasks >=35 && tasks <= 124)
         {
            return 70;
         }
         if (tasks > 124)
         {
            return 85;
         }
      }
      if (priority == 2)
      {
         if (tasks < 35)
         {
            return 40;
         }
         if (tasks >=35 && tasks <= 124)
         {
            return 45;
         }
         if (tasks > 124)
         {
            return 50;
         }
      }
      if (priority == 3)
      {
         if (tasks < 35)
         {
            return 25;
         }
         if (tasks >=35 && tasks <= 124)
         {
            return 30;
         }
         if (tasks > 124)
         {
            return 35;
         }
      }
      return 16;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int priority;
      int numTasks;

      priority = scnr.nextInt();
      numTasks = scnr.nextInt();
   
      System.out.println(findResources(priority, numTasks));
   }
}
