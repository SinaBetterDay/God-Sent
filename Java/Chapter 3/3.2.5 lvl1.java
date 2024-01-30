import java.util.Scanner;

public class Coat {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int coatCount;
      
      coatCount = scnr.nextInt();

      if (coatCount <= 9)
      {
         System.out.println("Small closet");
      }
      else if (coatCount <= 20)
      {
         System.out.println("Mid-sized closet");
      }
      else
      {
         System.out.println("Too many coats");
      }
   }
}
