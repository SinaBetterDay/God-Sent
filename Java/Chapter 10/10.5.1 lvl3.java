/*String fileName is read from input. The try block opens a file named fileName to read a floating-point number into heightValue.

Write an exception handler to catch a FileNotFoundException. In the catch block, output fileName, followed by ": File not available". End with a newline.
After the catch block, close heightScanner if heightScanner is open.
Ex: If the input is height2.txt, then the output is:

Value read from height2.txt: 4.9
Ex: If the input is invalid.txt, then the output is:

invalid.txt: File not available*/


import java.util.Scanner;
import java.io.FileNotFoundException;
// This program uses an overloaded FileInputStream library to check for file closure

public class ReadInputFile {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      FileInputStream fileInStream;
      Scanner heightScanner = null;
      String fileName;
		double heightValue;
		
		fileName = scnr.next();
		
		try {
			fileInStream = new FileInputStream(fileName);
			heightScanner = new Scanner(fileInStream);
			heightValue = heightScanner.nextDouble();
			System.out.println("Value read from " + fileName + ": " + heightValue);
		}
		
      catch (FileNotFoundException e) {
         System.out.println(fileName + ": File not available");
      }
      finally {
         if (heightScanner != null) {
            heightScanner.close();
         }
      }
   }
}
