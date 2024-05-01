/*HashSet newAges contains integers 79, 63, 20, and 66. Integer setSize is read from input representing the number of integers to be read next. Using a loop, for each integer read:

If the integer is in newAges, increment totalEncountered.
Otherwise, output the integer followed by " is not encountered".
Lastly, output "Total encountered: " followed by totalEncountered. End each output with a newline.

Ex: If the input is:

3
20 66 70
then the output is:

70 is not encountered
Total encountered: 2*/



import java.util.HashSet;
import java.util.Scanner;

public class Ages {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      HashSet<Integer> newAges = new HashSet<Integer>();
      int setSize;
      int age;
		int totalEncountered;
		int i;
      
      newAges.add(79);
		newAges.add(63);
		newAges.add(20);
		newAges.add(66);
		
		setSize = scnr.nextInt();
		totalEncountered = 0;

      for (i = 0; i < setSize; ++i) {
         age = scnr.nextInt();
         if (newAges.contains(age)) {
            totalEncountered++;
         } else {
            System.out.println(age + " is not encountered");
         }
      }
      System.out.println("Total encountered: " + totalEncountered);

   }
}
