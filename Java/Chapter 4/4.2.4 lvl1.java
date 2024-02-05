import java.util.Scanner;

public class StipendAllowed {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
		int inputNumber;
		int stipendAllowed;
      
      stipendAllowed = scnr.nextInt();
      inputNumber = scnr.nextInt();
      
      while (inputNumber != 1000)
      {
         if (inputNumber >= 0)
         {
            System.out.println(inputNumber);
            stipendAllowed -= inputNumber;
         }
         inputNumber = scnr.nextInt();
      }

   	System.out.println("The total after subtracting all positive values is " + stipendAllowed);
	}
}
