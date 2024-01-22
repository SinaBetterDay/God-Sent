import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      int seedVal;
		int sumRolls;
		int numSides;
		int dieRoll1;
		int dieRoll2;
		int dieRoll3;
		int dieRoll4;

      seedVal = scnr.nextInt();
		numSides = scnr.nextInt();

      randGen.setSeed(seedVal);

      dieRoll1 = randGen.nextInt(numSides) + 1;
      dieRoll2 = randGen.nextInt(numSides) + 1;
      dieRoll3 = randGen.nextInt(numSides) + 1;
      dieRoll4 = randGen.nextInt(numSides) + 1;
      
      sumRolls = dieRoll1 + dieRoll2 + dieRoll3 + dieRoll4;

		System.out.println(dieRoll1);
		System.out.println(dieRoll2);
		System.out.println(dieRoll3);
		System.out.println(dieRoll4);
		System.out.println("Sum: " + sumRolls);
   }
