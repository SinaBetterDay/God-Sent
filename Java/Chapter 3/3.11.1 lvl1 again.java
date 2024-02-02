import java.util.Scanner;

public class CharMatch {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userString;
		int idx1;
		int idx2;

      userString = scnr.nextLine();
		idx1 = scnr.nextInt();
		idx2 = scnr.nextInt();

      if (userString.charAt(idx1) == userString.charAt(idx2))
      {
         System.out.println("Found match");
      }
      else
      {
         System.out.println("No match");
      }
   }
}
