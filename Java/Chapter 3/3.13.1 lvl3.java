import java.util.Scanner;

public class FindLastField {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String internetHostname;
		int index1;
      
      internetHostname = scnr.nextLine();

      index1 = internetHostname.lastIndexOf('.');
      System.out.println(internetHostname.substring(index1+1));
   }
}
