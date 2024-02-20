import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      char targetChar = scanner.next().charAt(0);
      
      String inputString = scanner.nextLine();
      int count = 0;

      for (int i = 0; i < inputString.length(); i++) {
         if (inputString.charAt(i) == targetChar) {
             count++;
         }
      }
      System.out.print(count + " " + targetChar);
      
      if (count != 1) {
         System.out.print("'s");
      }
      
      System.out.println();
   }
}
