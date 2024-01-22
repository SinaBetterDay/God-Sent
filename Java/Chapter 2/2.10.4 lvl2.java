import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      int seedVal;
		int minValue;
		int maxValue;
		int lottery1;
		int lottery2;

      seedVal = scnr.nextInt();
		minValue = scnr.nextInt();
		maxValue = scnr.nextInt();

      randGen.setSeed(seedVal);

      lottery1 = randGen.nextInt(maxValue - minValue + 1) + minValue;
      lottery2 = randGen.nextInt(maxValue - minValue + 1) + minValue;
      
		System.out.println(lottery1);
		System.out.println(lottery2);
   }
}
