import java.util.Scanner;

public class SentenceFromStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userName;
      String className;

      userName = scnr.next();
      className = scnr.next();

      System.out.println(userName + " is taking " + className + ".");

   }
}
