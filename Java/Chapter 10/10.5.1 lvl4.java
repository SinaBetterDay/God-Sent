/*String saffronDataName is read from input. The try block opens a file named saffronDataName for output. Two integers are read from input, and each integer is written into the file. Write the finally block to perform the following tasks, if the output file is open:

Write to the file "Number of valid values read: ", followed by saffronCount and a newline.
If saffronCount is greater than zero, write to the file "Last value is: ", followed by lastValueRead and a newline.
Close the file.
Ex: If the input is saffronFile.txt 23 16, then saffronFile.txt contains:

23
16
Number of valid values read: 2
Last value is: 16
Ex: If the input is output.txt error 16, then output.txt contains:

Number of valid values read: 0
Ex: If the input is /invalid.txt, then the output is:

Error!
Note: Data output to a file may be lost if the file is not closed.*/

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WriteLastSaffronFile {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      PrintWriter saffronFileWriter = null;
      String saffronDataName;
      int saffronVal;
      int saffronCount = 0;
		int lastValueRead = 0;
		
      saffronDataName = scnr.next();
      
      try {
         saffronFileWriter = new PrintWriter(new FileOutputStream(saffronDataName));
         for (saffronCount = 0; saffronCount < 2; ++saffronCount) {
            saffronVal = scnr.nextInt();
            saffronFileWriter.println(saffronVal);				
				lastValueRead = saffronVal;
         }
      }
      catch (Exception e) {
         System.out.println("Error!");
      }

      finally {
         if (saffronFileWriter != null) {
            saffronFileWriter.println("Number of valid values read: " + saffronCount);
            if (saffronCount > 0) {
               saffronFileWriter.println("Last value is: " + lastValueRead);
            }
            saffronFileWriter.close();
         }
      }

   }
}
