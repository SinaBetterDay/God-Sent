/*Add an exception handler to catch an InputMismatchException exception and output "Error: Input for color intensity is bad". End with a newline.

Click here for example 1 (valid input)
Ex: If the input is 237, then the output is:
Color intensity is 237
Click here for example 2 (invalid input)
Ex: If the input is H, then the output is:
Error: Input for color intensity is bad*/


import java.util.Scanner;
import java.util.InputMismatchException;

public class ColorIntensity {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int colorIntensity;
      
      try {
         colorIntensity = scnr.nextInt();
         System.out.println("Color intensity is " + colorIntensity);
      }

      catch (InputMismatchException e) {
         System.out.println("Error: Input for color intensity is bad");
      }

   }
}
