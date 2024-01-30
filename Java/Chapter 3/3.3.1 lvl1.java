import java.util.Scanner;

public class AgeRanges {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userAge;

      userAge = scnr.nextInt();

      // Modify the following line
      if ((userAge >= 13) && (userAge <= 18)) {
         System.out.println("Currently a teenager");
      }
      else {
         System.out.println("Not currently a teenager");
      }
   }
}
