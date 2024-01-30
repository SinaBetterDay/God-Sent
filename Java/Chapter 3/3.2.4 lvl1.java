import java.util.Scanner;

public class BikeInfo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numberOfBikes;

      numberOfBikes = scnr.nextInt();

      if (numberOfBikes > 13)
      {
         System.out.println(numberOfBikes + ": Too many bikes");
      }

   }
}
