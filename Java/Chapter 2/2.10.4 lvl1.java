import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      int seedVal;
      int sum;
      int limitValue;
		int dataPoint1;
		int dataPoint2;
		int dataPoint3;

      seedVal = scnr.nextInt();
      limitValue = scnr.nextInt();

      randGen.setSeed(seedVal);

      dataPoint1 = randGen.nextInt(limitValue);
      dataPoint2 = randGen.nextInt(limitValue);
      dataPoint3 = randGen.nextInt(limitValue);

		sum = dataPoint1 + dataPoint2 + dataPoint3;

		System.out.println(dataPoint1);
		System.out.println(dataPoint2);
		System.out.println(dataPoint3);
		System.out.println("Sum: " + sum);
   }
}
