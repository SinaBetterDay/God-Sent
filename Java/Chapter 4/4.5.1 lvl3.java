import java.util.Scanner;

public class DropFirstThreeData {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String delimitedData;
      int i;
      int dashCount = 0;
		int thirdDash = -1;
   
      delimitedData = scnr.nextLine();

      for (i = 0; i < delimitedData.length(); i++)
      {
         if (delimitedData.charAt(i) == '-')
         {
            dashCount++;
         }
         if (dashCount == 2)
         {
            thirdDash = i+1;
         }
      }
      
      System.out.println("Remaining data: " + delimitedData.substring(thirdDash + 1));
   }
}
