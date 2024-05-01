/*performanceMap is a HashMap with String key type and Double value type, representing the name and score of an athlete. Integer numToRead is read from input. Complete the for loop to read numToRead strings from input. For each string read:

If the string is a key in performanceMap, then output the key followed by "->", and the value associated with the key.
Otherwise, output the string followed by ": not a key".
Ex: If the input is:

2
Ava Taj
then the output is:

Ava: not a key
Taj->98.5*/


import java.util.Scanner;
import java.util.HashMap;

public class SportsCompetition {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      HashMap<String, Double> performanceMap = new HashMap<String, Double>();
      String participantName;
      double scoreEarned;
      int numToRead;
      int i;

		performanceMap.put("Ada", 68.0);
		performanceMap.put("Taj", 98.5);
		performanceMap.put("Aya", 86.5);

		numToRead = scnr.nextInt();
		for (i = 0; i < numToRead; ++i) {

      participantName = scnr.next();
      
		if (performanceMap.containsKey(participantName)) {
         System.out.println(participantName + "->" + performanceMap.get(participantName));
      } 
      else {
         System.out.println(participantName + ": not a key");
         }
		}
   }
}
