import java.util.Scanner;

public class SumCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userIn;
		int result;

		result = 0;
		userIn = scnr.nextInt();

      while (userIn != -10)
      {
         result += userIn;
         userIn = scnr.nextInt();
      }

   	System.out.println(result);
	}
}
