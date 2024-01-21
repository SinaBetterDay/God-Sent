import java.util.Scanner;
 
public class RemainingMinutes {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int totalMinutes;
      int mileTime;
      int remainingMinutes;
 
      totalMinutes = scnr.nextInt();
      mileTime = scnr.nextInt();

      remainingMinutes = totalMinutes % mileTime;

      System.out.println("Remaining minutes: " + remainingMinutes);
   }
}
