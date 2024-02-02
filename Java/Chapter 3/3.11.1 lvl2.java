import java.util.Scanner;

public class StringSize {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String strInput1;
		String strInput2;
		String shorterStr;
   
      strInput1 = scnr.nextLine();
		strInput2 = scnr.nextLine();

      if (strInput1.length() > strInput2.length())
      {
         shorterStr = strInput2;
      }
      else if (strInput1.length() < strInput2.length())
      {
         shorterStr = strInput1;
      }
      else
      {
         shorterStr = "Same length";
      }
      
		System.out.println(shorterStr);
   }
}
