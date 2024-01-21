import java.util.Scanner;

public class SleepHours {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int sleepingHours1;
		int sleepingHours2;
      int kidsCount;
      double avgHours;

      sleepingHours1 = scnr.nextInt();
		sleepingHours2 = scnr.nextInt();
      kidsCount = scnr.nextInt();
   
      avgHours = ((double) sleepingHours1 + sleepingHours2) / kidsCount;

      System.out.println(avgHours);
   }
}
