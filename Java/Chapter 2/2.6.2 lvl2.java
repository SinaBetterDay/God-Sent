import java.util.Scanner;
 
public class ValueFinder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userVal;
      int tensDigit;
		int tmpVal;
 
      userVal = scnr.nextInt();

      tensDigit = userVal/10 % 10;

      System.out.println("Value in tens place: " + tensDigit);
   }
}
