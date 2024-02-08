import java.util.Scanner;

public class ValidInvalid {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String codeWord;
      boolean goodPassword;
      int digits = 0;
   
      codeWord = scnr.nextLine();
   
      
      for (int i = 0; i < codeWord.length(); i++)
      {
         if (Character.isDigit(codeWord.charAt(i)))
         {
            digits++;
         }
      }
      
      if (digits < 6 && codeWord.length() > 5)
      {
         goodPassword = true;
      }
      else
      {
         goodPassword = false;
      }

      if (goodPassword) {
         System.out.println("Valid");
      }
      else {
         System.out.println("Invalid");
      }
   }
}
