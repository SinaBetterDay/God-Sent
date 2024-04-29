/*Integer progressPercentage is read from input. Complete the try block to throw an exception with the message "Error: Progress percentage must be between 0 and 100".

Click here for examples
Ex 1: If the input is 78, then the output is:
Valid input: Progress percentage is 78
Ex 2: If the input is -87, then the output is:

Error: Progress percentage must be between 0 and 100
*/


import java.util.Scanner;

public class ProgressPercentage {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int progressPercentage;

      try {
         progressPercentage = scnr.nextInt();
         if ((progressPercentage < 0) || (progressPercentage > 100)) {
            throw new Exception("Error: Progress percentage must be between 0 and 100");
         }
         System.out.print("Valid input: ");
         System.out.println("Progress percentage is " + progressPercentage);
      }
      catch (Exception excpt) {
         System.out.println(excpt.getMessage());
      }
   }
}
