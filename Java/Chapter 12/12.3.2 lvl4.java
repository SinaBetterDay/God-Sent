/*wordDictionary is a HashMap with String key type and String value type. Each entry in wordDictionary associates an irregular word's singular form with the word's plural form. Integer numData is read from input. Then numData pairs of strings are read from input and inserted into wordDictionary. Complete the following tasks:

Read string foodSingular from input.
If foodSingular is an irregular word in wordDictionary, output foodSingular's associated plural form followed by " are common".
Otherwise, output foodSingular followed by "s are common".
End with a newline.

Ex: If the input is:

5
jerky jerkies garnish garnishes sandwich sandwiches berry berries asparagus asparagus
berry
then the output is:

berries are common*/



import java.util.Scanner;
import java.util.HashMap;

public class FoodDictionary {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      HashMap<String, String> wordDictionary = new HashMap<String, String>();
		String foodSingular;
      int numData;
      int i;

      numData = scnr.nextInt();
      for (i = 0; i < numData; ++i) {
         wordDictionary.put(scnr.next(), scnr.next());
      }

      foodSingular = scnr.next();

      if (wordDictionary.containsKey(foodSingular)) {
         System.out.println(wordDictionary.get(foodSingular) + " are common");
      } 
      else {
         System.out.println(foodSingular + "s are common");
      }

   }
}
