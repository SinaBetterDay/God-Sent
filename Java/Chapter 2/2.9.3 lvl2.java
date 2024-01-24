import java.util.Scanner;

public class FavoriteFlowers {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String favoriteFlower1;
      String favoriteFlower2;
		String favoriteFlower3;

      favoriteFlower1 = scnr.next();
      favoriteFlower2 = scnr.next();
      favoriteFlower3 = scnr.next();

      System.out.print("Favorite flowers: ");
		System.out.println(favoriteFlower1 + ", " + favoriteFlower2 + ", " + favoriteFlower3);
   }
}
