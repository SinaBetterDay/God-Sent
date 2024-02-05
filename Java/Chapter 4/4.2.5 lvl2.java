import java.util.Scanner;

public class PairedDataProcessing {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inputKey;
      int foodNumber;

      inputKey = scnr.next();
		foodNumber = scnr.nextInt();

      while (foodNumber > 25 && foodNumber < 50)
      {
         inputKey = scnr.next();
		   foodNumber = scnr.nextInt();
      }
		System.out.println(inputKey + ": is out of range!");
   }
}
