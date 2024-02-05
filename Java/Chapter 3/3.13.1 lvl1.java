import java.util.Scanner;

public class FindCharacter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String wordString;
      int index;
      
      wordString = scnr.next();

      if (wordString.indexOf('b') > 0)
      {
         System.out.println("First occurrence of character 'b' is at index " + wordString.indexOf('b') + ".");
      }
      else
      {
         System.out.println("Character 'b' is not found.");
      }
   }
}
