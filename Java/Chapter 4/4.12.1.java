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
      System.out.printf("%d %c%s\n", count, targetChar, (count == 1) ? "" : "'s");
   }
}
