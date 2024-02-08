import java.util.Scanner;

public class LoopPatterns {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numRows;
      int numColumns;
      int currentRow;
      char currentRowLetter;
      int currentColumn;
      int currentColumnInteger;
   
      numRows = scnr.nextInt();
      numColumns = scnr.nextInt();

      for (currentRow = 0; currentRow < numRows; currentRow++) {
         currentRowLetter = (char) ('A' + currentRow); 
      
         for (currentColumn = 1; currentColumn <= numColumns; currentColumn++) {
            System.out.print("" + currentRowLetter + currentColumn + " ");
         }
         System.out.println();
      }
   }
}
