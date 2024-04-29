/*The while loop makes multiple attempts to read an integer between 1 and 12 from input into birthMonth.

Write a catch block to catch any InputMismatchException thrown. In the catch block:
Output "Unexpected input: The BirthMonth program exits".
Assign tryAgain with false.
Then, write another catch block to catch any Exception thrown. In the catch block, output the message of the Exception.
End each output with a newline.

Click here for examples
Ex 1: If the input is 10, then the output is:
Valid input: Month of birth is 10
Ex 2: If the input is W, then the output is:

Unexpected input: The BirthMonth program exits
Ex 3: If the input is 21 10, then the output is:

Month of birth must be between 1 and 12
Valid input: Month of birth is 10*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class BirthMonth {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int birthMonth;
      boolean tryAgain = true;

      while (tryAgain) {
         try {
            birthMonth = scnr.nextInt();
  
            if ((birthMonth < 1) || (birthMonth > 12)) {
               throw new Exception("Month of birth must be between 1 and 12");
            }
  
            tryAgain = false;
            System.out.print("Valid input: ");
            System.out.println("Month of birth is " + birthMonth);
         }

         catch (InputMismatchException e) {
            System.out.println("Unexpected input: The BirthMonth program exits");
            tryAgain = false;
         }
         catch (Exception e) {
            System.out.println(e.getMessage());
         }

      }
   }
}
