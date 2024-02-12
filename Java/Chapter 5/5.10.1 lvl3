import java.util.Scanner;

public class MethodOverloadToTablespoons {
   public static int convertVolume(int cups) {
      return cups * 16;
   }

   public static int convertVolume(int cups, int tablespoons) {
      return (cups * 16) + tablespoons;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int cupsUsed;
      int tablespoonsUsed;
      int totalTablespoons1;
      int totalTablespoons2;
      
      cupsUsed = scnr.nextInt();
      tablespoonsUsed = scnr.nextInt();
      
      totalTablespoons1 = convertVolume(cupsUsed);
      System.out.println(cupsUsed + " cups yields " + totalTablespoons1 + " tablespoons.");
      
      totalTablespoons2 = convertVolume(cupsUsed, tablespoonsUsed);
      System.out.print(cupsUsed + " cups and " + tablespoonsUsed + " tablespoons yields ");
      System.out.println(totalTablespoons2 + " tablespoons.");
   }
}
