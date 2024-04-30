/*String collardFileName is read from input. The try block opens a file named collardFileName to read an integer into collardValue.

Complete the try-with-resources statement to declare a Scanner object named collardScanner with a FileInputStream constructed with string collardFileName.

Ex: If the input is collard1.txt, then the output is:

Value read from collard1.txt: 26
Ex: If the input is nofile.txt, then the output is:

nofile.txt: File not available*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFile {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String collardFileName;
      int collardValue;

      collardFileName = scnr.next();

      try (Scanner collardScanner = new Scanner(new FileInputStream(collardFileName))) {
         collardValue = collardScanner.nextInt();
         System.out.println("Value read from " + collardFileName + ": " + collardValue);
      }
      catch (IOException e) {
         System.out.println(collardFileName + ": File not available");
      }
   }
}
