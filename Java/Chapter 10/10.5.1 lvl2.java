/*String coconutDataName is read from input. The try block opens a file named coconutDataName using a try-with-resources statement, and reads an integer from the file into coconutData.

Write an exception handler to catch a FileNotFoundException and assign hasError with true.

Ex: If the input is coconut2.txt, then the output is:

Value read from coconut2.txt: 46
Success: File processed
Ex: If the input is bad.txt, then the output is:

Error opening file: bad.txt*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadInputFile {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String coconutDataName;
      int coconutData;		
		boolean hasError = false;

      coconutDataName = scnr.next();

      try (Scanner dataScanner = new Scanner(new FileInputStream(coconutDataName))) {
         coconutData = dataScanner.nextInt();
         System.out.println("Value read from " + coconutDataName + ": " + coconutData);
      }

      catch (FileNotFoundException e) {
         hasError = true;
      }

      /* dataScanner is automatically closed after the try block terminates. */		
		if (hasError) {
			System.out.println("Error opening file: " + coconutDataName);
		}
		else {
			System.out.println("Success: File processed");
		}
   }
}
