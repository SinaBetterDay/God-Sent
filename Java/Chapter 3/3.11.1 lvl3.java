import java.util.Scanner;

public class StringAppend {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userName;
      String lastName;
      
      userName = scnr.nextLine();
      lastName = scnr.nextLine();

      userName = userName + "," + lastName;

      System.out.println(userName);
   }
}
