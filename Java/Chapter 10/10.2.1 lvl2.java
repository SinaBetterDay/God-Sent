/*Integer numWheels is read from input.

Write a catch block to catch any InputMismatchException thrown and output "Input type error: Integer needed".
Then, write another catch block to catch any Exception thrown and output the Exception's message.
End each output with a newline.

Click here for examples
Ex 1: If the input is 24, then the output is:
Valid input: 24 wheels can make 12 scooters
Ex 2: If the input is B, then the output is:

Input type error: Integer needed
Ex 3: If the input is 65, then the output is:

Value error: Value divisible by 2 needed*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class TotalWheels {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numWheels;

      try {
         numWheels = scnr.nextInt();
         if (numWheels % 2 != 0) {
             throw new Exception("Value error: Value divisible by 2 needed");
         }
         System.out.print("Valid input: ");
         System.out.println(numWheels + " wheels can make " + (numWheels / 2) + " scooters");
      }

      catch (InputMismatchException e) {
         System.out.println("Input type error: Integer needed");
      }
      catch (Exception e) {
         System.out.println(e.getMessage());
      }

   }
}
