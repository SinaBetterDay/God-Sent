import java.util.Scanner;

public class FindSemicolons {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String peopleNames;
      int i;
		int numOccurrences = 0;
   
      peopleNames = scnr.nextLine();

      for (i = 0; i < peopleNames.length(); i++) {
         if (peopleNames.charAt(i) == ';') {
            System.out.println("Semicolon found at index " + i);
            numOccurrences++;
         }
      }

   	System.out.println("Semicolon occurs " + numOccurrences + " times");
	}
}
