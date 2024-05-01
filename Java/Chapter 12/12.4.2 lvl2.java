/*HashSet numberArchive contains integers 84, 88, and 70. Integer numElements is read from input representing the number of integers to be read next. For each integer read into variable deleteNumber:

If deleteNumber is in numberArchive:
Remove deleteNumber from numberArchive.
Output deleteNumber followed by " is deleted".
Increment numDropped.
Otherwise, output deleteNumber followed by " is not in the set".
End each output with a newline.

Ex: If the input is:

3
48 88 61
then the output is:

48 is not in the set
88 is deleted
61 is not in the set
Total withdrawn: 1*/



import java.util.HashSet;
import java.util.Scanner;

public class Numbers {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      HashSet<Integer> numberArchive = new HashSet<Integer>();
      int numElements;
		int deleteNumber;
		int numDropped;
      int i;

      numberArchive.add(84);
		numberArchive.add(88);
		numberArchive.add(70);
		
		numElements = scnr.nextInt();
		numDropped = 0;

      for (i = 0; i < numElements; ++i) {
         deleteNumber = scnr.nextInt();

      	if (numberArchive.contains(deleteNumber)) {
            numberArchive.remove(deleteNumber);
            System.out.println(deleteNumber + " is deleted");
            numDropped++;
         } else {
            System.out.println(deleteNumber + " is not in the set");
         }

      }
		System.out.println("Total withdrawn: " + numDropped);
   }
}
