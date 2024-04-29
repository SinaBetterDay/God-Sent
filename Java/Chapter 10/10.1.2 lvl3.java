/*The while loop reads values from input until -1 is read. Add an exception handler in the while loop to catch an InputMismatchException exception and:

Output "Unacceptable input for postal ZIP code is removed". End with a newline.
Discard the invalid input.
Click here for example 1 (valid input)
Ex: If the input is:
71242 25341 -1
then the output is:

Postal ZIP code is 71242
Postal ZIP code is 25341
Processed 2 valid input values
Click here for example 2 (invalid input)
Ex: If the input is:
M 71242 B 25341 -1
then the output is:

Unacceptable input for postal ZIP code is removed
Postal ZIP code is 71242
Unacceptable input for postal ZIP code is removed
Postal ZIP code is 25341
Processed 2 valid input values
Note: Each value read from input is on one line.*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class ManyPostalZipCodes {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int postalZipCode;
      int hasRead = 0;
		boolean keepOn = true;
      
      while (keepOn) {
         try {
            postalZipCode = scnr.nextInt();
            if (postalZipCode == -1) {
					System.out.println("Processed " + hasRead + " valid input values");
					keepOn = false;
				}
				else {
					System.out.println("Postal ZIP code is " + postalZipCode);
					++hasRead;
				}
         }

         catch (InputMismatchException e) {
            System.out.println("Unacceptable input for postal ZIP code is removed");
            scnr.next();
            keepOn = true;
         }

      }
   }
}
