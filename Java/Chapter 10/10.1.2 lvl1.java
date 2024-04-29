/*Add a try block that:

Reads integer patientAge from input.
Outputs "Patient's age is " followed by the value of patientAge. End with a newline.
Click here for example 1 (valid input)
Ex: If the input is 48, then the output is:
Patient's age is 48
Click here for example 2 (invalid input)
Ex: If the input is D, then the output is:
Error: Input for patient's age cannot be processed*/




import java.util.Scanner;
import java.util.InputMismatchException;

public class PatientAge {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int patientAge;

      try {
         patientAge = scnr.nextInt();
         System.out.println("Patient's age is " + patientAge);
      }

      catch (InputMismatchException excpt) {
         System.out.println("Error: Input for patient's age cannot be processed");
      }
   }
}
